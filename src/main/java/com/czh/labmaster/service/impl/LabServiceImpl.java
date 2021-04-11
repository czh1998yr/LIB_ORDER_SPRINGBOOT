package com.czh.labmaster.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.czh.labmaster.mapper.LabMapper;
import com.czh.labmaster.model.Lab;
import com.czh.labmaster.service.LabService;
import org.springframework.stereotype.Service;



@Service
public class LabServiceImpl extends ServiceImpl<LabMapper, Lab> implements LabService {
}
