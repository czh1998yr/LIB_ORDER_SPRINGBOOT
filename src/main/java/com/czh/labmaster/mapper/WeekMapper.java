package com.czh.labmaster.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.czh.labmaster.base.result.Result;
import com.czh.labmaster.model.Week;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeekMapper extends BaseMapper<Week> {
  List<Week> findAll(int termstate);

  IPage<Week> checkLabByWeek(Page<Week> page, Integer week);

  List<Week> findAllday(int termstate);
}
