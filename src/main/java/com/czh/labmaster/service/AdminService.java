package com.czh.labmaster.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.czh.labmaster.base.result.Result;
import com.czh.labmaster.model.Admin;

public interface AdminService extends IService<Admin> {
  public Result<Object> login(Admin admin);
}
