package com.czh.labmaster.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Orders {
  private Long id;
  private String username;
  private String labname;
  private Long starttime;
  private Long endtime;
}
