package com.boot.service;

import com.boot.dto.UserDto;

/**
 * Created by WangJie on 2018/7/9.
 */
public interface UserService {

    String sayHello(String str);

    UserDto findUser();

}
