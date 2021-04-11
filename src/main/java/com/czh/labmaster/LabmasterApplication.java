package com.czh.labmaster;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.czh.labmaster.mapper")
@SpringBootApplication
public class LabmasterApplication {

  public static void main(String[] args) {
    SpringApplication.run(LabmasterApplication.class, args);
  }

}
