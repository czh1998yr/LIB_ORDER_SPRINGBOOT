package com.czh.labmaster.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.czh.labmaster.mapper.LabMapper;
import com.czh.labmaster.model.Lab;
import com.czh.labmaster.service.LabService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class LabServiceImpl extends ServiceImpl<LabMapper, Lab> implements LabService {

  @Autowired
  LabMapper labMapper;


  @Override
  public List<Map<String, Object>> LabQuery(String major) {

    List<Map<String, Object>> listMaps = new ArrayList<Map<String, Object>>();
    Map<String,Object> map = new HashMap<String, Object>();
    map.put("querydata",labMapper.findBymajor("%"+major+"%"));
    listMaps.add(map);
    return listMaps;
  }
}
