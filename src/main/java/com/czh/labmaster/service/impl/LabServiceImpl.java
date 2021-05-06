package com.czh.labmaster.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.czh.labmaster.base.result.Result;
import com.czh.labmaster.mapper.LabMapper;
import com.czh.labmaster.model.Labs;
import com.czh.labmaster.model.Orders;
import com.czh.labmaster.model.Week;
import com.czh.labmaster.service.LabService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class LabServiceImpl extends ServiceImpl<LabMapper, Labs> implements LabService {

  @Autowired
  LabMapper labMapper;


//  获取所有实验室列表
  @Override
  public List<Labs> AllLab() {
    return labMapper.selectList(null);
  }

  @Override
  public Result<Object> addlab(Labs labs) {
    labMapper.addlab(labs);
    return Result.success();
  }

  @Override
  public Labs labnum(Integer labnum) {
    return labMapper.selectBylabnum(labnum);
  }

  @Override
  public Result<Object> revise(Labs labs) {
    labMapper.revise(labs);
    return Result.success();
  }

  @Override
  public int dellab(Integer id) {
    return labMapper.deleteById(id);
  }

  @Override
  public Labs selectbyid(Integer id) {
    return  labMapper.selectById(id);
  }

  @Override
  public IPage<Labs> allpage(Integer size, Integer current,String labname) {
    Page<Labs> page = new Page<>(current,size);
    return labMapper.selectPageByLabname(page,"%"+labname+"%");
  }
}
