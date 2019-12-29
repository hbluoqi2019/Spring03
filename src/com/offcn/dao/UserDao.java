package com.offcn.dao;

import com.offcn.pojo.User;

public interface UserDao {

    void login();

    User findById(int id);

}
