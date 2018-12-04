package com.yrj.controller;

import com.yrj.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @RequestMapping("/showUser")
    public String showUser(Model model){
        List<Users> list = new ArrayList<>();
        list.add(new Users(1,"张三",18));
        list.add(new Users(2,"李四",20));
        list.add(new Users(3,"王五",22));

        model.addAttribute("list",list);
        return "userList";
    }
}
