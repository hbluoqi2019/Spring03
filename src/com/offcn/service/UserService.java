package com.offcn.service;

import com.offcn.pojo.User;

public interface UserService {
    public void login();
    public void sayhello();

    User findById(int id);
}
