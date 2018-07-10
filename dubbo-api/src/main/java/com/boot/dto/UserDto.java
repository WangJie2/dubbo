package com.boot.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by WangJie on 2018/7/9.
 */
@Data
public class UserDto implements Serializable{
    private static final long serialVersionUID = 7871389309864020039L;
    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private Integer gender;
}
