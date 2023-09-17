package com.example.service.impl;

import com.example.dao.UserRepository;
import com.example.entity.User;
import com.example.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserRepository userRepository;

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        List<User> all = userRepository.findAll();
        if(CollectionUtils.isEmpty(all)){
            return null;
        }
        return all;
    }

    @Override
    public boolean exists(Integer id) {
        return false;
    }

    @Override
    public void update(User user) {
        // TODO: 2023/6/20 更新操作
    }

    @Override
    public User getById(Integer id) {
        return null;
    }
}
