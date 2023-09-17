package com.example.ioc.config;

import com.example.ioc.dao.UserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean("userDao")
    public UserDao userDao(){
        return new UserDao();
    }
}
