package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
 
@RestController
public class helloWorld {
    @RequestMapping("/")
    @ResponseBody
    public String hello(){
        return "Hello World";
    }
}