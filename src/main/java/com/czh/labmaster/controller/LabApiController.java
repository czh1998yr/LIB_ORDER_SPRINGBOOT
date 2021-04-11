package com.czh.labmaster.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.czh.labmaster.base.Vo.LabVo;
import com.czh.labmaster.base.controller.BaseApiController;
import com.czh.labmaster.model.Lab;
import com.czh.labmaster.service.LabService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LabApiController extends BaseApiController {

  @Autowired
  LabService labService;

  @RequestMapping("/lab_table")
  public LabVo lab_table(@RequestParam(value = "pn",defaultValue = "1")Integer pn,
                         @RequestParam(value = "item",defaultValue = "5")Integer item,
                             Lab lab) {

    LabVo labVo =new LabVo();
    //分页查询数据
    Page<Lab> labPage = new Page<>(pn,item);
    //分页查询结果
    Page<Lab> page = labService.page(labPage,null);
    long current =page.getCurrent();
    long pages = page.getPages();
    long total = page.getTotal();

    labVo.setCurrent((int) current);
    labVo.setSize((int) pages);
    labVo.setItem(item);
    labVo.setTotal(total);
    labVo.setLabList(page.getRecords());

    return labVo;
  }
}
