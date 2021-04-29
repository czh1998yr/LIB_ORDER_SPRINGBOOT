package com.czh.labmaster.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.czh.labmaster.base.result.Result;
import com.czh.labmaster.model.User;
import com.czh.labmaster.model.Week;

public interface UserService extends IService<User> {
  Result<Object> login(User user);
  Result<Object> regist(User user);
  Result<Object> revise(User user);
  Result<Object> UPWD(User user);
  User id(Integer id);
  int deluser(Integer id);
  IPage<User> selectPageall(Integer size, Integer current, String username);
}
