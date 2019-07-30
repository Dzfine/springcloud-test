package com.example.service_provider.controller;

import com.example.service_provider.entity.User;
import com.example.service_provider.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/hello")
    public String hello(){
        return "This is service provider!";
    }

    User user = new User(1, "xiaoli", "male", 100000);
    @RequestMapping("/getUser")
    public User getUser() {
        return user;
    }

    String userName = "david";

    @RequestMapping(value = "/getUserByName", method = RequestMethod.GET)
    public User getUserByName() {
        return helloService.getUserByName(userName);
    }


}
