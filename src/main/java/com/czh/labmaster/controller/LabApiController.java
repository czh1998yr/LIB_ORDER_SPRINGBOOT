package com.czh.labmaster.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.czh.labmaster.base.controller.BaseApiController;
import com.czh.labmaster.base.result.Result;
import com.czh.labmaster.model.Labs;
import com.czh.labmaster.model.Week;
import com.czh.labmaster.service.LabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class LabApiController extends BaseApiController {

  @Autowired
  LabService labService;

  @RequestMapping("/addlab")
  public Result<Object> addlab(Labs labs){return labService.addlab(labs);};

  //  获取所有实验室列表
  @RequestMapping("/lablist")
  List<Labs> AllLab(){return labService.AllLab();}

  @RequestMapping("/lablistpage")
  public IPage<Labs> allpage(Integer size, Integer current,String labname){return labService.allpage(size,current,labname);};

  @RequestMapping("/lablabnum")
  public Labs labnum(Integer labnum){return labService.labnum(labnum);};

  @RequestMapping("/reviselab")
  public Result<Object> revise(Labs labs){ return labService.revise(labs);};

  @RequestMapping("/dellab")
  public int dellab(Integer id){return labService.dellab(id);};

  @RequestMapping("/labid")
  public Labs selectbyid(Integer id){return labService.selectbyid(id);}
}
