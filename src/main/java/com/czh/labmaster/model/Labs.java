package com.czh.labmaster.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Labs {
  private Long id;
  private String labname="";
  private String major="";
  private Long labnum;
}
