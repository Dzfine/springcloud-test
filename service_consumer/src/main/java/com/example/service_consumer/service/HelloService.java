package com.example.service_consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    /*service-consumer通过服务名调用service-provider的hello服务*/
    public String getHelloContentByServiceName() {
        return restTemplate.getForObject("http://service-provider/hello", String.class);
    }

    /*service-consumer通过服务名调用service-provider的getUser服务*/
    public String getUser() {
        return restTemplate.getForObject("http://service-provider/getUser", String.class);
    }

    public String getUserByName() {
        return restTemplate.getForObject("http://service-provider/getUserByName?userName={1}", String.class, "mary");
    }

}
