package com.czh.labmaster.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.czh.labmaster.base.result.Result;
import com.czh.labmaster.mapper.LabMapper;
import com.czh.labmaster.model.Lab;
import com.czh.labmaster.service.LabService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LabServiceImpl extends ServiceImpl<LabMapper, Lab> implements LabService {

  @Autowired
  LabMapper labMapper;

  @Override
  public IPage<Lab> selectPageall(Integer size, Integer current, String major) {
    Page<Lab> page = new Page<>(current,size);
    return labMapper.selectPageVo(page,"%"+major+"%");
  }

  @Override
  public Result<Object> addlab(Lab lab) {
    labMapper.addlab(lab);
    return Result.success();
  }

  @Override
  public Lab id(Integer id) {
    return labMapper.selectById(id);
  }

  @Override
  public Result<Object> revise(Lab lab) {
    labMapper.revise(lab);
    return Result.success();
  }

  @Override
  public int dellab(Integer id) {
    return labMapper.deleteById(id);
  }
}
