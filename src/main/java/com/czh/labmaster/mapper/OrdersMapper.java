package com.czh.labmaster.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.czh.labmaster.model.Orders;

import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface OrdersMapper extends BaseMapper<Orders> {
  void lab_order(Orders orders);
  List<Object> findTime(String labname);
}
