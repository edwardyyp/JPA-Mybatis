package com.manage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@ServletComponentScan
@MapperScan("com.manage.dao")
public class ManageApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ManageApplication.class, args);
    }

}

