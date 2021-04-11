package com.czh.labmaster.base.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:8081",allowCredentials = "true")
public class BaseApiController {

}
