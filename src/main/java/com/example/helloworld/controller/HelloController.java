package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    /**
     * 接口: localhost:8080/hello
     */
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!!";
    }
}
