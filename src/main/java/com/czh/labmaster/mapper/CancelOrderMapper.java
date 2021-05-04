package com.czh.labmaster.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.czh.labmaster.model.CancelOrder;


import org.springframework.stereotype.Repository;



@Repository
public interface CancelOrderMapper extends BaseMapper<CancelOrder> {
  void addmessage(CancelOrder cancelOrder);
  IPage<CancelOrder> selectbystate(Page<CancelOrder> page, String state);

  void upstate(int id);
}
