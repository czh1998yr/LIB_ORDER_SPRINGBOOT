package com.czh.labmaster.service.impl;



import com.alibaba.fastjson.JSONArray;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.czh.labmaster.base.result.Result;
import com.czh.labmaster.mapper.OrdersMapper;
import com.czh.labmaster.mapper.UserOrdersMapper;
import com.czh.labmaster.model.Orders;
import com.czh.labmaster.model.UserOrders;
import com.czh.labmaster.service.OrdersService;
import com.czh.labmaster.service.UserOrdersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.text.ParseException;


@Service
public class UserOrdersServicImpl extends ServiceImpl<UserOrdersMapper, UserOrders> implements UserOrdersService {

  @Autowired
  UserOrdersMapper userOrdersMapper;

  @Override
  public Result<Object> adduserorders(@RequestBody JSONArray userorders) throws ParseException {

    for (int i =0; i<userorders.size();i++) {
      UserOrders userordersExistN = userOrdersMapper.findByUsernameAndDate(userorders.getJSONObject(i));
      if (userordersExistN != null) {
        return null;
      }else {
        userOrdersMapper.addorders(userorders.getJSONObject(i));;
      }
    }
    System.out.println(userorders);
    return Result.success();
  }

  @Override
  public Result<Object> delbyid(Integer id) throws ParseException {
    userOrdersMapper.deleteById(id);
    return Result.success();
  }
}
