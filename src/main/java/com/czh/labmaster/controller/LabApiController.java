package com.czh.labmaster.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.czh.labmaster.base.Vo.LabVo;
import com.czh.labmaster.base.controller.BaseApiController;
import com.czh.labmaster.base.result.Result;
import com.czh.labmaster.model.Lab;
import com.czh.labmaster.service.LabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LabApiController extends BaseApiController {

  @Autowired
  LabService labService;

  @RequestMapping("/addlab")
  public Result<Object> addlab(Lab lab){return labService.addlab(lab);};

  @RequestMapping("/lablist")
  IPage<Lab> selectPageVo(Integer size, Integer current, String major) {
    return labService.selectPageall(size,current,major);}

  @RequestMapping("/labid")
  public Lab id(Integer id){return labService.id(id);};

  @RequestMapping("/reviselab")
  public Result<Object> revise(Lab lab){ return labService.revise(lab);};

  @RequestMapping("/dellab")
  public int dellab(Integer id){return labService.dellab(id);};
}
