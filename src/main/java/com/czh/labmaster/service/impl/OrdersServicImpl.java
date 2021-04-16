package com.czh.labmaster.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.czh.labmaster.base.result.Result;
import com.czh.labmaster.base.result.ResultCode;
import com.czh.labmaster.mapper.OrdersMapper;
import com.czh.labmaster.model.Orders;
import com.czh.labmaster.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrdersServicImpl extends ServiceImpl<OrdersMapper, Orders> implements OrdersService {

  @Autowired
  OrdersMapper ordersMapper;

  @Override
  public Result<Object> lab_order(Orders orders) throws ParseException {

//    List listMaps = new ArrayList();
//    listMaps.add(ordersMapper.findTime(orders.getLabname()));
//    System.out.println(listMaps);
//    for (int i = 0 ; i <listMaps.stream().count(); i++){
//      System.out.println(i);
//    }
//    int startTime = map.querydata[0].starttime;
//    int endTime = 5;
//    int nowTime1 = Math.toIntExact(orders.getStarttime());
//    int nowTime2 = Math.toIntExact(orders.getEndtime());
//    System.out.println(startTime);
//    if(nowTime1 > startTime && nowTime1 < endTime){
//      System.out.println("预约失败1");
//    }else if(nowTime1 < startTime) {
//      if (nowTime2 < startTime) {
//        System.out.println("预约成功1");
//      } else {
//        System.out.println("预约失败2");
//      }
//    }else {
//      System.out.println("预约成功2");
//    }
    ordersMapper.lab_order(orders);
    return Result.success();
  }
}
