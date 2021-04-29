package com.czh.labmaster.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

import lombok.Data;

@Data
public class Orders {

  private Long id;
  private String username="";
  private String labname="";
  private String major="";
  private Long labnum;

  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private Date date;

  private Long week;
  private Long day;

  private Boolean s1;
  private Boolean s2;
  private Boolean s3;
  private Boolean s4;
  private Boolean s5;
  private Boolean s6;
  private Boolean s7;
  private Boolean s8;
  private Boolean s9;
  private Boolean s10;
  private Boolean s11;
  private Boolean s12;
}
