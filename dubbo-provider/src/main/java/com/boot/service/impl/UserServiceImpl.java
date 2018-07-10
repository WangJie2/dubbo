package com.boot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.boot.dto.UserDto;
import com.boot.service.UserService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by WangJie on 2018/7/9.
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello(String str) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return dateFormat.format(new Date()) + ": " + str;
    }

    @Override
    public UserDto findUser() {
        UserDto userDto = new UserDto();
        userDto.setUsername("张三");
        userDto.setPassword("123456");
        userDto.setAge(28);
        userDto.setId(1001);
        userDto.setGender(0);
        return userDto;
    }
}
