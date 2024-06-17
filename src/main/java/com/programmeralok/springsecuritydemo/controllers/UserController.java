package com.programmeralok.springsecuritydemo.controllers;

import com.programmeralok.springsecuritydemo.models.User;
import com.programmeralok.springsecuritydemo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("register")
    public User register(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @PostMapping("login")
    public String login(@RequestBody User user) {
        return userService.login(user);
    }

    @GetMapping("all")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }


}
