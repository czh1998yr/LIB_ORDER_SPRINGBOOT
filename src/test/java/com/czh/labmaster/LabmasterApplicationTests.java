package com.czh.labmaster;

import com.czh.labmaster.mapper.LabMapper;
import com.czh.labmaster.mapper.UserMapper;
import com.czh.labmaster.model.Lab;
import com.czh.labmaster.model.User;
import com.czh.labmaster.service.LabService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class LabmasterApplicationTests {

  @Autowired
  JdbcTemplate jdbcTemplate;

  @Autowired
  UserMapper userMapper;

  @Autowired
  LabMapper labMapper;

  @Test
  void contextLoads() {
    Long along = jdbcTemplate.queryForObject("select count(*) from user",long.class);
    log.info("记录数："+along);
  }

  @Test
  void testUserInfoMapper() {
    User user = userMapper.selectById(1L);
    log.info("用户信息: {}", user);
  }

  @Test
  void testLabMapper() {
    Lab lab = labMapper.selectById(1L);
    log.info("用户信息: {}", lab);
  }

}
