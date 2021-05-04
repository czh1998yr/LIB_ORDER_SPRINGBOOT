package com.czh.labmaster.service.impl;



import com.alibaba.fastjson.JSONArray;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.czh.labmaster.base.result.Result;
import com.czh.labmaster.mapper.CancelOrderMapper;
import com.czh.labmaster.mapper.UserOrdersMapper;
import com.czh.labmaster.model.CancelOrder;
import com.czh.labmaster.model.Orders;
import com.czh.labmaster.model.UserOrders;
import com.czh.labmaster.service.CancelOrderService;
import com.czh.labmaster.service.UserOrdersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.text.ParseException;


@Service
public class CancelOrderServicImpl extends ServiceImpl<CancelOrderMapper, CancelOrder> implements CancelOrderService {

  @Autowired
  CancelOrderMapper cancelOrderMapper;

  @Override
  public Result<Object> addmessage(CancelOrder cancelOrder) throws ParseException {
//    System.out.println(cancelOrder);
    cancelOrderMapper.addmessage(cancelOrder);
    return Result.success();
  }

  @Override
  public IPage<CancelOrder> selectPagecancel(Integer size, Integer current, String state) {
    Page<CancelOrder> page = new Page<>(current,size);
    return cancelOrderMapper.selectbystate(page,"%"+state+"%");
  }

  @Override
  public Result<Object> upstate(int id) throws ParseException {
    cancelOrderMapper.upstate(id);
    return Result.success();
  }
}
