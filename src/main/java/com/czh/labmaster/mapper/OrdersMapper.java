package com.czh.labmaster.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.czh.labmaster.model.Orders;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface OrdersMapper extends BaseMapper<Orders> {
  void order(Orders orders);
  List<Object> findTime(String labname);
  IPage<Orders> selectPageMyOrder(Page<Orders> page, String username);
}
