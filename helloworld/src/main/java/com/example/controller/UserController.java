package com.example.controller;

import com.example.common.ResponseResult;
import com.example.entity.User;
import com.example.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @PostMapping("/add")
    public ResponseResult<User> add(User user){
        if(user.getUserId()==null||!userService.exists(user.getUserId())){
            user.setCreateTime(LocalDateTime.now());
            user.setUpdateTime(LocalDateTime.now());
            userService.save(user);
        }
        else
        {
            user.setUpdateTime(LocalDateTime.now());
            userService.update(user);
        }
        return ResponseResult.success(userService.getById(user.getUserId()));

    }

    @GetMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }
}
