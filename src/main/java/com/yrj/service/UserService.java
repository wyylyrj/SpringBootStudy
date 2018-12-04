package com.yrj.service;

import com.yrj.pojo.User;

public interface UserService {
    void addUser(String name,Integer age);
    Object getUser(Integer id);
}

