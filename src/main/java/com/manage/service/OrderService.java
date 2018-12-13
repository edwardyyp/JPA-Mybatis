package com.manage.service;

import com.manage.entity.jpa.Order;
import org.springframework.data.domain.Page;

import java.util.List;

public interface OrderService {

    List<Order> getUserList();

    Order addUserInfo(Order order);

    Order updateUserInfoById(Order order);

    List<Order> getCurrentUserList();

    Page<Order> getPageUserList();
}
