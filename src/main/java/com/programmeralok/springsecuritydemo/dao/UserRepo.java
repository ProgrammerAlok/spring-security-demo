package com.programmeralok.springsecuritydemo.dao;

import com.programmeralok.springsecuritydemo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
