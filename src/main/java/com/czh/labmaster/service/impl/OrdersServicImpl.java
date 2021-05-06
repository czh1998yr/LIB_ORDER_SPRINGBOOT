package com.czh.labmaster.service.impl;


import com.alibaba.fastjson.JSONArray;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.czh.labmaster.base.result.Result;
import com.czh.labmaster.mapper.LabMapper;
import com.czh.labmaster.mapper.OrdersMapper;
import com.czh.labmaster.model.Orders;
import com.czh.labmaster.model.UserOrders;
import com.czh.labmaster.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


@Service
public class OrdersServicImpl extends ServiceImpl<OrdersMapper, Orders> implements OrdersService {

  @Autowired
  OrdersMapper ordersMapper;

  @Autowired
  LabMapper labMapper;

  @Override
  public Result<Object> lab_order(@RequestBody JSONArray orders) throws ParseException {
    for (int i =0; i<orders.size();i++) {
      ordersMapper.order(orders.getJSONObject(i));
    }
    return Result.success();
  }

  //    根据周数天数搜索该天的实验室信息
    @Override
  public IPage<Orders> checkorders(Integer size, Integer current, Integer week, Integer labnum) {
    Page<Orders> page = new Page<>(current,size);
    return ordersMapper.checkorders(page,week,labnum);
  }

  @Override
  public IPage<Orders> selectPageMyOrder(Integer size, Integer current, String username) {
    Page<Orders> page = new Page<>(current,size);
    return ordersMapper.selectPageMyOrder(page,username);
  }

  @Override
  public IPage<Orders> selectall(Integer size, Integer current) {
    Page<Orders> page = new Page<>(current,size);
    return ordersMapper.selectPage(page,null);
  }

  @Override
  public IPage<Orders> OrderByName(Integer size, Integer current, String username) {
    Page<Orders> page = new Page<>(current,size);
    return ordersMapper.OrderByName(page,"%"+username+"%");
  }

  @Override
  public IPage<Orders> checkorder(Integer size, Integer current, Integer week1, Integer week2, Integer labnum) {
    Page<Orders> page = new Page<>(current,size);
    return ordersMapper.checkorder(page,week1,week2,labnum);
  }
}
