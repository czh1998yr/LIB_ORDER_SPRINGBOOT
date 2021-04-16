package com.czh.labmaster.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.czh.labmaster.base.controller.BaseApiController;
import com.czh.labmaster.base.result.Result;
import com.czh.labmaster.model.User;
import com.czh.labmaster.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserApiController extends BaseApiController {
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

  @RequestMapping("/userslist")
  IPage<User> selectPageVo(Integer size, Integer current, String username) {
    return userService.selectPageall(size,current,username);
  };
}