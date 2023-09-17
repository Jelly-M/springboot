package com.example.ioc.service.impl;

import com.example.ioc.Entity.User;
import com.example.ioc.dao.UserDao;
import com.example.ioc.service.UserService;
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
}
