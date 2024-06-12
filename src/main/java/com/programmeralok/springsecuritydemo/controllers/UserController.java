package com.programmeralok.springsecuritydemo.controllers;

import com.programmeralok.springsecuritydemo.models.User;
import com.programmeralok.springsecuritydemo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("register")
    public User register(@RequestBody User user) {
        return userService.saveUser(user);
    }


}
