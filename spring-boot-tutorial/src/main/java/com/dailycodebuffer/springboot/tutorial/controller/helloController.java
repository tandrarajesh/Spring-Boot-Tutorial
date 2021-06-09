package com.dailycodebuffer.springboot.tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// This commented annotations is for understanding
//@Component
//@Controller
@RestController
public class helloController {

    // we can this in cmd by   mvn spring-boot:run
    //@RequestMapping(value = "/" , method = RequestMethod.GET)
    @GetMapping("/")
    public String helloWorld(){
        return "Welcome to daily code buffer!!!";
    }
}
