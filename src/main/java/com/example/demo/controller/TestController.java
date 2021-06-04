package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/test1")
    public String test1(){
        return "1111";
    }

    @RequestMapping("/test2")
    public String test2(){
        return "2222";
    }
}
