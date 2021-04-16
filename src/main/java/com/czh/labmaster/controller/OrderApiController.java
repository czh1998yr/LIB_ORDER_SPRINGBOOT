package com.czh.labmaster.controller;

import com.czh.labmaster.base.controller.BaseApiController;
import com.czh.labmaster.base.result.Result;
import com.czh.labmaster.model.Orders;
import com.czh.labmaster.service.OrdersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

@RestController
public class OrderApiController extends BaseApiController {

  @Autowired
  OrdersService ordersService;

  @RequestMapping("/order")
  public Result<Object> order(Orders orders) throws ParseException {
    return ordersService.lab_order(orders);
  }
}
