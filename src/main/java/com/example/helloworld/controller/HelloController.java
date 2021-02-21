package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zxz
 */
@RestController
@RequestMapping("/hello") // 设置主入口
public class HelloController {

    /**
     * 接口: localhost:8080/hello
     * 加入主入口后，接口变为 localhost:8080/hello/hello
     */
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello World!!";
    }
}
