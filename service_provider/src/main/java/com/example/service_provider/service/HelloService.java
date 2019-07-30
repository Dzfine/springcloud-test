package com.example.service_provider.service;

import com.example.service_provider.entity.User;
import com.example.service_provider.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    @Autowired
    UserMapper userMapper;

    public User getUserByName(String userName) {
        return userMapper.queryUserByName(userName);
    }
}
