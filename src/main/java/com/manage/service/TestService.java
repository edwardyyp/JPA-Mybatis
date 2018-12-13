package com.manage.service;

import com.manage.entity.mybatis.Test;

public interface TestService {

    public Test getById(int testId);

    boolean addTest(Test record);
}
