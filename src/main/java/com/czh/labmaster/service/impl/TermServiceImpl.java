package com.czh.labmaster.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.czh.labmaster.mapper.TermMapper;
import com.czh.labmaster.mapper.WeekMapper;
import com.czh.labmaster.model.Term;
import com.czh.labmaster.model.Week;
import com.czh.labmaster.service.TermService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TermServiceImpl extends ServiceImpl<TermMapper, Term> implements TermService {

  @Autowired
  TermMapper termMapper;

  @Override
  public List<Term> findAll() {
    return termMapper.selectByMap(null);
  }
}
