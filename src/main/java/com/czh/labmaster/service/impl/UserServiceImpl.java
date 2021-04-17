package com.czh.labmaster.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.czh.labmaster.base.result.Result;
import com.czh.labmaster.base.result.ResultCode;
import com.czh.labmaster.mapper.UserMapper;
import com.czh.labmaster.model.User;
import com.czh.labmaster.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.UUID;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

  @Autowired
  UserMapper userMapper;

  public Result<Object> login(User user){//TODO：登陆逻辑函数
      User userExistN = userMapper.findByName(user.getUsername());
      String newpassword = DigestUtils.md5DigestAsHex(user.getPassword().getBytes());
      if (userExistN != null){
        String userExistP = userMapper.findPswByName(user.getUsername());
        if (userExistP.equals(newpassword)){
          //生成Token令牌
          String token = UUID.randomUUID()+"";
          return Result.success(token);
        }else {
          return Result.failure(ResultCode.USER_LOGIN_ERROR1);
        }
      }else {
        return Result.failure(ResultCode.USER_LOGIN_ERROR2);
      }
  }

  public Result<Object> regist(User user){//TODO：注册判断逻辑函数

      User userExist = userMapper.findByName(user.getUsername());
      if (userExist != null){
        return Result.failure(ResultCode.USER_REGISTER_ERROR);
      }else {
        String newpassword = DigestUtils.md5DigestAsHex(user.getPassword().getBytes());
        user.setPassword(newpassword);
        userMapper.save(user);
        return Result.success();
      }
  }

  @Override
  public Result<Object> revise(User user) {
    String newpassword = DigestUtils.md5DigestAsHex(user.getPassword().getBytes());
    user.setPassword(newpassword);
    userMapper.revise(user);
    return Result.success();
  }

  @Override
  public User id(Integer id) {
    return userMapper.selectById(id);
  }

  @Override
  public int deluser(Integer id) {
    return userMapper.deleteById(id);
  }

  @Override
  public IPage<User> selectPageall(Integer size, Integer current, String username) {
    Page<User> page = new Page<>(current,size);
    return userMapper.selectPageVo(page,"%"+username+"%");
  }
}
