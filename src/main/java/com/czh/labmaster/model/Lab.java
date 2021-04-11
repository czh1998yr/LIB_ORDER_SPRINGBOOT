package com.czh.labmaster.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Lab {

  private Long id;
  private String name="";
  private String major="";
  private int num;
  private String state="";

  @Override
  public String toString() {
    return "Lab{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", major='" + major + '\'' +
            ", num=" + num +
            ", state='" + state + '\'' +
            '}';
  }
}
