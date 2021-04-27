package com.czh.labmaster.service.impl;


import com.alibaba.fastjson.JSONArray;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.czh.labmaster.base.result.Result;
import com.czh.labmaster.mapper.LabMapper;
import com.czh.labmaster.mapper.OrdersMapper;
import com.czh.labmaster.model.Orders;
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

//  @Override
//  public Result<Object> lab_order(Orders orders) throws ParseException {

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

//    /*
//    把前台返回的时间转成yyyy-MM-dd HH:mm格式并写入实验室总数据库，并根据被预约的实验室的id更改实验室状态
//     */
//    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//    String starttime = simpleDateFormat.format(orders.getStarttime());
//    String endttime = simpleDateFormat.format(orders.getEndtime());
//    String state = starttime+"至"+endttime+"/被"+orders.getUsername()+"预约！";
//    int id = Math.toIntExact(orders.getLid());
//    labMapper.upState(state,id);
//
//    /*
//      String(yyyy-MM-dd HH:mm:ss)转10位时间戳
//     */
//    int starttimeTimestanmp = (int) ((Timestamp.valueOf(starttime).getTime()) / 1000);
//    int endttimeTimestanmp = (int) ((Timestamp.valueOf(endttime).getTime()) / 1000);
//
//    System.out.println("开始时间戳："+starttimeTimestanmp+"结束时间戳："+endttimeTimestanmp);
//    /*
//    把预约信息写入预约表中
//     */
//    ordersMapper.order(orders);
//    return Result.success();
//  }
//
  @Override
  public IPage<Orders> selectPageMyOrder(Integer size, Integer current, String username) {
    Page<Orders> page = new Page<>(current,size);
    return ordersMapper.selectPageMyOrder(page,username);
  }

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
      System.out.println(size);
      System.out.println(current);
      System.out.println(week);
      System.out.println(labnum);
    Page<Orders> page = new Page<>(current,size);
    return ordersMapper.checkorders(page,week,labnum);
  }
}
