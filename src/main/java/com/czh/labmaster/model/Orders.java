package com.czh.labmaster.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order {
  private Long id;
  private String username;
  private String labname;
  private Date starttime;
  private Date endtime;
  private String section;

  @Override
  public String toString() {
    return "Order{" +
            "id=" + id +
            ", username='" + username + '\'' +
            ", labname='" + labname + '\'' +
            ", starttime=" + starttime +
            ", endtime=" + endtime +
            ", section='" + section + '\'' +
            '}';
  }
}
