package com.czh.labmaster.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.czh.labmaster.base.result.Result;
import com.czh.labmaster.base.result.ResultCode;
import com.czh.labmaster.mapper.AdminMapper;
import com.czh.labmaster.model.Admin;
import com.czh.labmaster.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.UUID;
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper , Admin> implements AdminService {


  @Autowired
  AdminMapper adminMapper;

  @Override
  public Result<Object> login(Admin admin) {
    Admin adminExistN = adminMapper.findByName(admin.getUsername());
    String newpassword = DigestUtils.md5DigestAsHex(admin.getPassword().getBytes());
    if (adminExistN != null){
      String adminExistP = adminMapper.findPswByName(admin.getUsername());
      if (adminExistP.equals(newpassword)){
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
}
