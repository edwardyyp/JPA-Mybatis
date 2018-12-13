package com.manage.service.impl;

import com.manage.entity.jpa.Order;
import com.manage.repository.OrderRepository;
import com.manage.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    /**
     * 获取所有用户列表
     *
     * @return
     */
    @Override
    public List<Order> getUserList() {
        List<Order> orderList = new ArrayList<Order>();
        orderList = orderRepository.findAll();
        return orderList;
    }


    /**
     * 新增用户信息
     *
     * @param order 用户信息
     * @return
     */
    public Order addUserInfo(Order order) {
        return orderRepository.save(order);
    }

    /**
     * 更新用户信息
     *
     * @param order 用户信息
     * @return
     */
    public Order updateUserInfoById(Order order) {
        return orderRepository.save(order);
    }


    /**
     * 获取最新的用户
     *
     * @return
     */
    public List<Order> getCurrentUserList() {
        Sort sort = new Sort(Sort.Direction.DESC, "createTime");
        return orderRepository.findAll(sort);

    }

    /**
     * 获取分页的用户
     *
     * @return
     */
    public Page<Order> getPageUserList() {
        Sort sort = new Sort(Sort.Direction.DESC, "createTime");
        Pageable pageable = new PageRequest(0, 5, sort);
        return orderRepository.findAll(pageable);
    }
}
