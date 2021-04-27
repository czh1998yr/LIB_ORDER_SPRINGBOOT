package com.czh.labmaster.controller;


import com.czh.labmaster.base.controller.BaseApiController;
import com.czh.labmaster.model.Week;
import com.czh.labmaster.service.WeekService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
public class WeekControl extends BaseApiController {

  @Autowired
  WeekService weekService;

  @RequestMapping("/getwekk")
  List<Week> findAll(){return weekService.findAll();}
}