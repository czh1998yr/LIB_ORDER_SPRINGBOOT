package com.czh.labmaster.config;

import com.czh.labmaster.interceptors.JWTInterceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(new JWTInterceptor())
            .addPathPatterns("/**")     //保护接口
            .excludePathPatterns("/api/login/**");  //放行登录接口

  }

  @Override
  public void addCorsMappings(CorsRegistry corsRegistry){
    /**
     * 跨域
     */
    corsRegistry.addMapping("/**")
            .allowCredentials(true)
            .allowedOriginPatterns("*")
            .allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE")
            .allowedHeaders("*")
            .maxAge(3600);
  }
}
