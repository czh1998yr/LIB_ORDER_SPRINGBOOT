package com.czh.labmaster.base.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Calendar;
import java.util.Map;

public class JWTUtils {

  private static final String SING = "!@#$%czh25003";
  /*
  生成Token header.payload.sing
   */
  public static String getToken(Map<String,String> map) {
    Calendar instance = Calendar.getInstance();
    instance.add(Calendar.MINUTE,20); //默认20分钟过期

//    创建Jwt builder
    JWTCreator.Builder builder = JWT.create();

//    payload
    map.forEach((k,v)->{
      builder.withClaim(k,v);
    });

    String token = builder.withExpiresAt(instance.getTime()) //指定令牌过期时间
                .sign(Algorithm.HMAC256(SING));
    return token;
  }
  /*
  验证token合法性
   */
  public static DecodedJWT verify(String token) {
    return JWT.require(Algorithm.HMAC256(SING)).build().verify(token);
  }
}
