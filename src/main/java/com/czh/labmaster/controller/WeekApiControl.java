package com.czh.labmaster.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.czh.labmaster.base.controller.BaseApiController;
import com.czh.labmaster.base.result.Result;
import com.czh.labmaster.model.Orders;
import com.czh.labmaster.model.Term;
import com.czh.labmaster.model.Week;
import com.czh.labmaster.service.TermService;
import com.czh.labmaster.service.WeekService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
public class WeekApiControl extends BaseApiController {

  @Autowired
  WeekService weekService;

  @Autowired
  TermService termService;

  @RequestMapping("/getweek")
  List<Week> findAll(int termstate){return weekService.findAll(termstate);}

  @RequestMapping("/getterm")
  List<Term> findAll(){return termService.findAll();}

  @RequestMapping("/checkLabByWeek")
  IPage<Week> checkLabByWeek(Integer size, Integer current, Integer week){return weekService.checkLabByWeek(size,current,week);};

  @RequestMapping("/getall")
  List<Week> allweek(Integer termstate){return weekService.allweek(termstate);};
}