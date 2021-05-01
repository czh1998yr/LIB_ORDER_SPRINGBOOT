package com.czh.labmaster.controller;

import com.alibaba.fastjson.JSONArray;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.czh.labmaster.base.controller.BaseApiController;
import com.czh.labmaster.base.result.Result;
import com.czh.labmaster.model.Orders;
import com.czh.labmaster.model.UserOrders;
import com.czh.labmaster.service.OrdersService;
import com.czh.labmaster.service.UserOrdersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
public class OrderApiController extends BaseApiController {

  @Autowired
  OrdersService ordersService;

  @Autowired
  UserOrdersService userOrdersService;

  @RequestMapping("/order")
  public Result<Object> order(@RequestBody JSONArray orders) throws ParseException {return ordersService.lab_order(orders);}
  //    根据周数天数搜索改天的实验室
  @RequestMapping("/checkorders")
  public IPage<Orders> checkorders(Integer size, Integer current, Integer week, Integer labnum){return ordersService.checkorders(size,current,week,labnum);};

  @RequestMapping("/adduserorder")
  public Result<Object> adduserorders(@RequestBody JSONArray userorders) throws ParseException{
    return userOrdersService.adduserorders(userorders);
  }

  @RequestMapping("/delmyordersbyid")
  Result<Object> delbyid(Integer id) throws ParseException{return userOrdersService.delbyid(id);}

  @RequestMapping("/userorders")
  public IPage<Orders> selectall(Integer size, Integer current){return ordersService.selectall(size,current);};

  @RequestMapping("/nameorders")
  public IPage<Orders> OrderByName(Integer size, Integer current, String username){return ordersService.OrderByName(size,current,username);};

  @RequestMapping("/myorders")
  IPage<Orders> selectPageMyOrder(Integer size, Integer current, String username){return ordersService.selectPageMyOrder(size,current,username);};
}
