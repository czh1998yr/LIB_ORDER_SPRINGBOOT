package com.czh.labmaster.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

import lombok.Data;

@Data
public class CancelOrder {
  private Long id;
  private String username;
  private String labname;
  private Long labnum;

  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private Date date;

  private String session;
  private String state;
  private String week;
  private String day;

  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:  ss", timezone = "GMT+8")
  private Date createTime;
}
