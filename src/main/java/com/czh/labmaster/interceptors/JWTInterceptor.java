package com.czh.labmaster.interceptors;

import com.auth0.jwt.exceptions.SignatureVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.czh.labmaster.base.utils.JWTUtils;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.util.WebUtils;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JWTInterceptor implements HandlerInterceptor {


  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

    response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
    response.addHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
    response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
    response.setHeader("Access-Control-Allow-Credentials", "true");
    response.setHeader("Access-Control-Max-Age", "3600");

    response.setHeader(
            "Access-Control-Allow-Headers", "Authorization,Origin,X-Requested-With,Content-Type,Accept,"
                    + "content-Type,origin,x-requested-with,content-type,accept,authorization,token,id,X-Custom-Header,X-Cookie,Connection,User-Agent,Cookie,*");
    response.addHeader("Access-Control-Request-Headers", "Authorization,Origin, X-Requested-With,content-Type,Accept");
    response.setHeader("Access-Control-Expose-Headers", "*");


    response.setHeader("Content-type", "text/html;charset=UTF-8");
    response.setCharacterEncoding("UTF-8");

    Map<String,Object> map = new HashMap<>();
//    获取请求头中的令牌
    String token = request.getHeader("Authorization");
    try {
      JWTUtils.verify(token); //验证令牌
      return true;
    } catch (SignatureVerificationException e) {
      e.printStackTrace();
      map.put("code","401");
      map.put("msg","无效签名");
    } catch (TokenExpiredException e) {
      e.printStackTrace();
      map.put("code","402");
      map.put("msg","token过期");
    } catch (Exception e) {
      e.printStackTrace();
      map.put("code","403");
      map.put("msg","token无效！！");
    }
    map.put("state",false); //设置状态
//    将map转为json
    String json = new ObjectMapper().writeValueAsString(map);
    response.setContentType("application/json;charset=UTF-8");
    response.getWriter().println(json);
    return false;
  }
}
