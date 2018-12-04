package com.yrj.controller;

import com.yrj.pojo.User;
import com.yrj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private UserService userService;

    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }

    @RequestMapping("getUser")
    public Object getUser(Integer id){
        return userService.getUser(id);
    }

    @RequestMapping("/addUser")
    public String addUser(String name,Integer age){
        this.userService.addUser(name,age);
        return "ok";
    }
}
