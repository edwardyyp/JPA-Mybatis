package com.manage.controller;

import com.manage.entity.mybatis.Test;
import com.manage.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/test")
public class TestController {
    @Resource
    private TestService testService;

    @RequestMapping("/showTest")
    @ResponseBody
    public Test toIndex(HttpServletRequest request) {
        int userId = Integer.parseInt(request.getParameter("id"));
        Test test = this.testService.getById(userId);
        return test;
    }
}
