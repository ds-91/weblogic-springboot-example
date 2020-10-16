package com.example.weblogicspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {

  @RequestMapping("/")
  public String index() {
    return "hello!";
  }
}