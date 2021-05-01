package com.czh.labmaster.service;

import com.alibaba.fastjson.JSONArray;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.czh.labmaster.base.result.Result;
import com.czh.labmaster.model.UserOrders;

import org.springframework.web.bind.annotation.RequestBody;

import java.text.ParseException;


public interface UserOrdersService extends IService<UserOrders> {
//  IPage<UserOrders> selectPageMyOrder(Integer size, Integer current, String username);
  Result<Object> adduserorders(@RequestBody JSONArray userorders) throws ParseException;
  Result<Object> delbyid(Integer id) throws ParseException;
}
