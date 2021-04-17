package com.czh.labmaster.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.czh.labmaster.base.result.Result;
import com.czh.labmaster.model.Lab;
import com.czh.labmaster.model.User;

public interface LabService extends IService<Lab> {
  IPage<Lab> selectPageall(Integer size, Integer current, String major);
  public Result<Object> addlab(Lab lab);
  public Lab id(Integer id);
  public Result<Object> revise(Lab lab);
  public int dellab(Integer id);
}
