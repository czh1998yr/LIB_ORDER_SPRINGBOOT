package com.czh.labmaster.base.Vo;

import com.czh.labmaster.model.Labs;

import java.util.List;

import lombok.Data;

@Data
public class LabVo {
  private Integer current;
  private Integer size;
  private Integer item;
  private Long total;
  private List<Labs> labsList;
}
