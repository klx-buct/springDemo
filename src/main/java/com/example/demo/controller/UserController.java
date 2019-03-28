package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("add")
    public String add() {
        User user = new User();
        user.setUsername("xxx");
        user.setPassword("xxxxxxxxxx");
        user.setContent("这是插入的一条测试数据");
        userService.add(user);
        return "add success";
    }
}
