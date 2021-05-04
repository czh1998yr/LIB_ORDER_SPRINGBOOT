package com.czh.labmaster.service;

import com.alibaba.fastjson.JSONArray;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.czh.labmaster.base.result.Result;
import com.czh.labmaster.model.CancelOrder;

import org.springframework.web.bind.annotation.RequestBody;

import java.text.ParseException;


public interface CancelOrderService extends IService<CancelOrder> {
  Result<Object> addmessage(CancelOrder cancelOrder) throws ParseException;
  IPage<CancelOrder> selectPagecancel(Integer size, Integer current, String state);
  Result<Object> upstate(int id) throws ParseException;
}
