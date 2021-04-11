package com.czh.labmaster.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloControl {


  @RequestMapping("/api/hello")
  public String handle01() {
    return "Hello,Spring Boot!" + "你好，我是陈自海";
  }
}