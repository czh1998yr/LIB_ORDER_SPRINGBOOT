package com.czh.labmaster.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

import lombok.Data;

@Data
public class Week {
  private Long id;
  private Long week;
  private Long day;
  private Long termstate;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private Date date;
}
