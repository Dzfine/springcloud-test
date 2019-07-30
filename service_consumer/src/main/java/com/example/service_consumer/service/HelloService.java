package com.example.service_consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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
}
