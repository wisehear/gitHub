package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class helloWorld {
    @RequestMapping("/")
    public String hello(){
        return "Hello World";
    }
    @RequestMapping("/bye")
    public String bye(){
        return "bye! bye!";
    }
}
