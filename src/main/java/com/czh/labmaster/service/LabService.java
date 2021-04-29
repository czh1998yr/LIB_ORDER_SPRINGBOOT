package com.czh.labmaster.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.czh.labmaster.base.result.Result;
import com.czh.labmaster.model.Labs;

public interface LabService extends IService<Labs> {
  //  获取所有实验室列表
  IPage<Labs> AllLab(Integer size, Integer current, String major);
  Result<Object> addlab(Labs labs);
  Labs labnum(Integer labnum);
  Result<Object> revise(Labs labs);
  int dellab(Integer id);
  Labs selectbyid(Integer id);
}
