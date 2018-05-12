package com.sdf.jewelry.controller;

import com.sdf.jewelry.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String Login() {
        return userService.getUser(1L).getName();
    }
}
