package com.yrj.controller;

import com.yrj.pojo.User;
import com.yrj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class Userscontroller {

    @Autowired
    private UserService userService;

    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }

    @RequestMapping("/addUser")
    public String addUser(User user){
        this.userService.addUser(user);
        return "ok";
    }
}
