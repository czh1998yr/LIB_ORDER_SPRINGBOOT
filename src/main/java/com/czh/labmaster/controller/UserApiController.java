package com.czh.labmaster.controller;


import com.czh.labmaster.base.controller.BaseApiController;
import com.czh.labmaster.base.result.Result;
import com.czh.labmaster.model.User;
import com.czh.labmaster.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginApiController extends BaseApiController {
  @Autowired
  UserService userService;

  @RequestMapping("/login")
  public Result<Object> login(User user){
    return userService.login(user);
  }

  @RequestMapping("/regist")
  public Result<Object> regist(User user){
    return userService.regist(user);
  }

}