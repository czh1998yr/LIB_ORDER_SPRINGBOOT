package com.czh.labmaster.mapper;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.czh.labmaster.model.UserOrders;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;


@Repository
public interface UserOrdersMapper extends BaseMapper<UserOrders> {

  void addorders(@RequestBody JSONObject userorders);
  UserOrders findByUsernameAndDate(@RequestBody JSONObject userorders);
  IPage<UserOrders> selectPageUserOrderByName(Page<UserOrders> page, String username);
}
