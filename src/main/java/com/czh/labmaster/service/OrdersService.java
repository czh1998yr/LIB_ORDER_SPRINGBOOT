package com.czh.labmaster.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.czh.labmaster.base.result.Result;
import com.czh.labmaster.model.Orders;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

public interface OrdersService extends IService<Orders> {
  public Result<Object> lab_order(Orders orders) throws ParseException;
}
