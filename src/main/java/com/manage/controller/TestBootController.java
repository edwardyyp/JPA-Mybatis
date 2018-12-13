package com.manage.controller;

import com.manage.entity.mybatis.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/testboot")
public class TestBootController {
    @RequestMapping("getuser")
    public Test getUser() {
        Test user = new Test();
        user.setUsername("test");
        return user;
    }
}