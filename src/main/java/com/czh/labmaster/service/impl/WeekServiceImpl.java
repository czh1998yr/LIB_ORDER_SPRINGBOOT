package com.czh.labmaster.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.czh.labmaster.base.result.Result;
import com.czh.labmaster.mapper.TermMapper;
import com.czh.labmaster.mapper.WeekMapper;
import com.czh.labmaster.model.Orders;
import com.czh.labmaster.model.Term;
import com.czh.labmaster.model.Week;
import com.czh.labmaster.service.WeekService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeekServiceImpl extends ServiceImpl<WeekMapper,Week> implements WeekService {

  @Autowired
  WeekMapper weekMapper;

  @Override
  public List<Week> findAll(int termstate) {
    return weekMapper.findAll(termstate);
  }

  @Override
  public IPage<Week> checkLabByWeek(Integer size, Integer current, Integer week) {
    Page<Week> page = new Page<>(current,size);
    return weekMapper.checkLabByWeek(page,week);
  }

  @Override
  public List<Week> allweek(Integer termstate) {
    return weekMapper.findAllday(termstate);
  }
}
