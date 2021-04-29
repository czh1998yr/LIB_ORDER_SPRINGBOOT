package com.czh.labmaster.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.czh.labmaster.model.Term;

import java.util.List;

public interface TermService extends IService<Term> {
  List<Term> findAll();
}
