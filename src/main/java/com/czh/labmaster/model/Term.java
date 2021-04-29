package com.czh.labmaster.model;

import java.util.Date;

import lombok.Data;

@Data
public class Term {
  private Long id;
  private String title;
  private Date starttime;
  private Date endtime;
  private Long state;
}
