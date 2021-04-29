package com.czh.labmaster.mapper;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.czh.labmaster.model.Orders;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;


@Repository
public interface OrdersMapper extends BaseMapper<Orders> {
  void order(@RequestBody JSONObject orders);
//  List<Object> findTime(String labname);
//  IPage<Orders> selectPageMyOrder(Page<Orders> page, String username);
//    根据周数天数搜索改天的实验室
    IPage<Orders> checkorders(Page<Orders> page, Integer week, Integer labnum);

}
