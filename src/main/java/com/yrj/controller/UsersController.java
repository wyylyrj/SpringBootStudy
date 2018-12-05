package com.yrj.controller;

import com.yrj.pojo.User;
import com.yrj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private UserService userService;

    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }

    @RequestMapping("/getUser")
    public String getUser(Integer id , Model model){
        User user =  userService.getUser(id);
        model.addAttribute("user",user);
        return "showUser";
    }

    @RequestMapping("/getUserAll")
    public String getUserAll(Model model){
        List<User> list = this.userService.getUserAll();
        model.addAttribute("list",list);
        return "showUserAll";
    }

    @RequestMapping("/addUser")
    public String addUser(String name,Integer age){
        this.userService.addUser(name,age);
        return "ok";
    }

    @RequestMapping("/updateUser")
    public String updateUser(Integer id,String name,Integer age){
        this.userService.updateUser(id,name,age);
        return "ok";
    }

    @RequestMapping("/delUser")
    public String delUser(Integer id){
        this.userService.delUser(id);
        return "redirect:/user/getUserAll";
    }
}
