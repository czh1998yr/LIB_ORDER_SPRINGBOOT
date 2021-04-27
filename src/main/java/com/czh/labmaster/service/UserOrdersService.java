package com.czh.labmaster.service;

import com.alibaba.fastjson.JSONArray;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.czh.labmaster.base.result.Result;
import com.czh.labmaster.model.Orders;

import org.springframework.data.relational.core.sql.In;
import org.springframework.web.bind.annotation.RequestBody;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;


public interface OrdersService extends IService<Orders> {
  public Result<Object> lab_order(@RequestBody JSONArray orders) throws ParseException;

//    根据周数及实验室编号搜索改天的实验室
    public IPage<Orders> checkorders(Integer size, Integer current, Integer week, Integer labnum);

  IPage<Orders> selectPageMyOrder(Integer size, Integer current, String username);
}
