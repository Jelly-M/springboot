package com.example.service.impl;

import com.example.Entity.User;
import com.example.dao.UserDao;
import com.example.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public List<User> queryAll() {
        return userDao.queryAll();
    }

    @Override
    public void doMethod() {

    }

    @Override
    public void doMethod2() {

    }
}
