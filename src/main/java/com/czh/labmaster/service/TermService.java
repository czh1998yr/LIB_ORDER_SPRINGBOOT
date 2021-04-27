package com.czh.labmaster.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.czh.labmaster.model.Term;
import com.czh.labmaster.model.Week;

import java.util.List;

public interface WeekService extends IService<Week> {

  List<Week> findAll(int termstate);
}
