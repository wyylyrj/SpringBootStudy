package com.yrj.service;

import com.yrj.pojo.User;

import java.util.List;

public interface UserService {
    void addUser(String name,Integer age);
    User getUser(Integer id);
    List<User> getUserAll();
    void updateUser(Integer id,String name,Integer age);
    void delUser(Integer id);
}

