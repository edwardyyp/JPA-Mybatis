package com.manage.service.impl;

import com.manage.dao.TestMapper;
import com.manage.entity.mybatis.Test;
import com.manage.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("testService")
public class TestServiceImpl implements TestService {
    @Resource
    private TestMapper testDao;

    public Test getById(int testId) {
        return testDao.selectByPrimaryKey(testId);
    }

    public boolean addTest(Test record) {
        boolean result = false;
        try {
            testDao.insertSelective(record);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}
