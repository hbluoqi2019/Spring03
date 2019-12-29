package com.offcn.test;

import com.offcn.controller.UserController;
import com.offcn.dao.UserDao;
import com.offcn.pojo.User;
import com.offcn.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:appliactionContext.xml")
public class UserTest {
    @Test
    public void test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("appliactionContext.xml");
        UserServiceImpl userService = (UserServiceImpl) ac.getBean("users");
        userService.sayhello();
    }
    @Test
    public void test2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("appliactionContext.xml");
        UserController userController = (UserController) ac.getBean("userController");
        userController.login();
    }
    @Autowired
    private UserController userController;
    @Autowired
    private UserDao userDao;
    @Test
    public void test3(){
        userController.login();
    }

    @Test
    public void test4(){
        userDao.login();
    }

    @Test
    public void test5(){
        User byId = userController.findById(1);
        System.out.println(byId);


    }
}
