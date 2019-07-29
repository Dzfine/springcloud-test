package com.example.service_consumer.controller;

import com.example.service_consumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/")
    public String hello(){
        return "This is service consumer!";
    }

    @RequestMapping("/getServiceProvider")
    public String getServiceProvider() {
        return helloService.getHelloContent();
    }
}
