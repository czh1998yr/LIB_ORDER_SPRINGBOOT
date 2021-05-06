package com.czh.labmaster.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.czh.labmaster.model.Labs;

import org.springframework.stereotype.Repository;

@Repository
public interface LabMapper extends BaseMapper<Labs> {
  //  获取所有实验室列表
  void addlab(Labs labs);
  void revise(Labs labs);
  void upState(String state,int id);
  Labs selectBylabnum(Integer labnum);
  IPage<Labs> selectPageByLabname(Page<Labs> page, String labname);
}
