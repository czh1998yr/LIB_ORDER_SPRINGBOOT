package com.czh.labmaster.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.czh.labmaster.model.User;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper extends BaseMapper<User> {
  List<User> findAll();
  User findByName(String name);
  String findPswByName(String UserName);
  void save(User user);
  IPage<User> selectPageVo(Page<?> page, String username);
}
