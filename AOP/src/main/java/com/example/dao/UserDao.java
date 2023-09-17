package com.example.dao;

import com.example.Entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {

    public List<User> queryAll(){

        List<User> users=new ArrayList<>();
        users.add(new User("张三",12));
        users.add(User.builder().Name("李四").Age(16).build());
        return users;
    }
}
