package com.offcn.service.impl;

import com.offcn.dao.UserDao;
import com.offcn.pojo.User;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public void login() {
    userDao.login();
    }

    @Override
    public void sayhello() {
        System.out.println("hello");
    }

    @Override
    public User findById(int id) {
        return userDao.findById(id);
    }
}
