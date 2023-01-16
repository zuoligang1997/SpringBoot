package com.itheima.springboot_02_configuration.request;

import lombok.Data;

/**
 * @ClassName UserReq
 * @Description TODO
 * @Author Ligang Zuo
 * @Date 2023-1-16 20:27
 */
public class UserReq {
    private String name;
    private Integer age;

    public UserReq() {
    }

    public UserReq(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
