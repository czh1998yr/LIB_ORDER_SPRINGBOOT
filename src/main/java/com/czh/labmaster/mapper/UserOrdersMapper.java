package com.czh.labmaster.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.czh.labmaster.model.Admin;
import com.czh.labmaster.model.User;
import org.springframework.stereotype.Repository;


@Repository
public interface AdminMapper extends BaseMapper<Admin> {
  Admin findByName(String name);
  String findPswByName(String UserName);
}
