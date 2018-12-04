package com.yrj.service.impl;

import com.yrj.mapper.UserMapper;
import com.yrj.pojo.User;
import com.yrj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(User user){
        this.userMapper.insertUser(user);
    }
}
