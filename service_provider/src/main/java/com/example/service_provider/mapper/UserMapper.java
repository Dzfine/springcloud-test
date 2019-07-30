package com.example.service_provider.mapper;

import com.example.service_provider.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User queryUserByName(String userName);

}
