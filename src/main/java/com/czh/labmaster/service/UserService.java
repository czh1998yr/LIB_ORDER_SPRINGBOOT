package com.czh.labmaster.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.czh.labmaster.base.result.Result;
import com.czh.labmaster.model.User;

public interface UserService extends IService<User> {
  public Result<Object> login(User user);
  public Result<Object> regist(User user);
  public Result<Object> revise(User user);
  public User id(Integer id);
  public int deluser(Integer id);
  IPage<User> selectPageall(Integer size, Integer current, String username);
}
