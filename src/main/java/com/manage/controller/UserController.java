package com.manage.controller;

import com.manage.entity.jpa.User;
import com.manage.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/add")
    public Object add(@RequestParam(name = "name", required = true) String name) {
        User user = new User();
        user.setUsername(name);
        userRepository.save(user);
        return user;
    }

    @RequestMapping("/list")
    public Object list() {
        Iterable<User> users = userRepository.findAll();
        return users;
    }
}

