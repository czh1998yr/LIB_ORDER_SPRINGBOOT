package com.czh.labmaster.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.czh.labmaster.model.User;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper extends BaseMapper<User> {
  List<User> findAll();
  User findByName(String name);
  String findPswByName(String UserName);
  void save(User user);
}
