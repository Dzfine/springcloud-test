package com.example.service_consumer.controller;

import com.example.service_consumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/")
    public String hello(){
        return "This is service consumer!";
    }

    @RequestMapping("/getServiceProviderByServiceName")
    public String getServiceProvider() {
        return helloService.getHelloContentByServiceName();
    }

    @RequestMapping("/getUser")
    public String getUser() {
        return helloService.getUser();
    }

    @RequestMapping("/getUserByName")
    public String getUserByName() {
        return helloService.getUserByName();
    }
}
