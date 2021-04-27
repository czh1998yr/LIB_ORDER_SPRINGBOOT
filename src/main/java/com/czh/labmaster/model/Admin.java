package com.czh.labmaster.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Admin {

  private Long id;
  private String username="";
  private String password="";
  private String repassword="";
  private String email="";

}
