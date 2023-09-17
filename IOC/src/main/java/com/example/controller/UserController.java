package com.example.ioc.controller;

import com.example.ioc.Entity.User;
import com.example.ioc.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/query")
    public List<User> queryAll(){
        List<User> users = userService.queryAll();
        if(CollectionUtils.isEmpty(users)){
            return null;
        }
        return users;
    }
}
