package com.example.service_provider.controller;

import com.example.service_provider.entity.User;
import com.example.service_provider.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

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

    @RequestMapping(value = "/getUserByName", method = RequestMethod.GET)
    public User getUserByName(HttpServletRequest httpServletRequest) {
        String userName = httpServletRequest.getParameter("userName");
        return helloService.getUserByName(userName);
    }


}
