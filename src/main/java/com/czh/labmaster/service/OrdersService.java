package com.czh.labmaster.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.czh.labmaster.base.result.Result;
import com.czh.labmaster.model.Orders;
import java.text.ParseException;


public interface OrdersService extends IService<Orders> {
  public Result<Object> lab_order(Orders orders) throws ParseException;
  public IPage<Orders> selectPageMyOrder(Integer size, Integer current, String username);
}
