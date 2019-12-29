package com.offcn.controller;

import com.offcn.pojo.User;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    public void login(){
        userService.login();
    }

    public User findById(int id){
        return userService.findById(id);
    }
}
