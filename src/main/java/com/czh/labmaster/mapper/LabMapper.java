package com.czh.labmaster.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.czh.labmaster.model.Lab;


import org.springframework.stereotype.Repository;

@Repository
public interface LabMapper extends BaseMapper<Lab> {
  IPage<Lab> selectPageVo(Page<Lab> page, String major);
  void addlab(Lab lab);
  void revise(Lab lab);
  void upState(String state,int id);
}
