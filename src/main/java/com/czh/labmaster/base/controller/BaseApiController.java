package com.czh.labmaster.base.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api")
//@CrossOrigin(origins = "http://172.21.12.85:8081,http://172.21.12.80:8081",allowCredentials = "true")
@CrossOrigin(originPatterns  = "*",allowCredentials = "true",maxAge = 3600)
public class BaseApiController {
}
