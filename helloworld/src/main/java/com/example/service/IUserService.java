package com.example.service;

import com.example.entity.User;

import java.util.List;

public interface IUserService {
     void save(User user);

     List<User> findAll();

     boolean exists(Integer id);

     void update(User user);

     User getById(Integer id);
}
