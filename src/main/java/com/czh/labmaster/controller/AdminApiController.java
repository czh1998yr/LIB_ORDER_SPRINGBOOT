package com.czh.labmaster.controller;

import com.czh.labmaster.base.controller.BaseApiController;
import com.czh.labmaster.base.result.Result;
import com.czh.labmaster.model.Admin;
import com.czh.labmaster.service.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminApiController extends BaseApiController {

  @Autowired
  AdminService adminService;

  @RequestMapping("/login/admin")
  public Result<Object> login(Admin admin) {
    return adminService.login(admin);
  }
}
