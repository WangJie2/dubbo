package com.boot.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.boot.dto.UserDto;
import com.boot.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by WangJie on 2018/7/9.
 */
@RestController
@RequestMapping("/")
public class UserController {

    @Reference(version = "1.0.0")
    private UserService userService;

    @GetMapping("hello")
    public String sayHello() {
        return userService.sayHello("Hello springboot and dubbo!");
    }

    @GetMapping("user")
    public UserDto loadUser() {
        return userService.findUser();
    }
}
