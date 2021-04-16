package com.czh.labmaster.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.czh.labmaster.model.Lab;

import java.util.List;
import java.util.Map;


public interface LabService extends IService<Lab> {
  public List<Map<String, Object>> LabQuery(String major);
}
