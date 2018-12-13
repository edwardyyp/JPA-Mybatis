package com.manage.repository;

import com.manage.entity.jpa.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    /**
     * 根据用户名查找
     *
     * @param username
     * @return
     */
    User findByUsername(String username);

}
