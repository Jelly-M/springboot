package com.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.User;
import com.example.mapper.user.UserMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository  {
    private List<User> users=new ArrayList<>();

    public UserRepository(){
        User user=new User();
        user.setUserId(1);
        user.setUserName("张三");
        users.add(user);
    }




    public void save(User user){
        users.add(user);
    }

    public List<User> findAll(){
        return users;
    }
}
