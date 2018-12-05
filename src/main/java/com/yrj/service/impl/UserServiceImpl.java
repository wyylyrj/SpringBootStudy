package com.yrj.service.impl;

import com.yrj.mapper.UserMapper;
import com.yrj.pojo.User;
import com.yrj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(String name,Integer age){

        this.userMapper.insertUser(name,age);
    }

    @Override
    public User getUser(Integer id) {
        User user = this.userMapper.getUserById(id);
        return user;
    }

    @Override
    public List<User> getUserAll() {
        List<User> list = this.userMapper.getUserAll();
        return list;
    }

    @Override
    public void updateUser(Integer id, String name, Integer age) {
        this.userMapper.updateUser(id,name,age);
    }

    @Override
    public void delUser(Integer id) {
        this.userMapper.delUser(id);
    }
}
