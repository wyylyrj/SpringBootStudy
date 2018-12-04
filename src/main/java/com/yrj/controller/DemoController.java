package com.yrj.controller;

import com.yrj.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller
public class DemoController {
    @RequestMapping("show")
    public String showInfo(Model model){
        model.addAttribute("msg","第一个Thymeleaf案例");
        model.addAttribute("date",new Date());
        return "index";
    }

    @RequestMapping("show2")
    public String showInfo2(Model model){
        model.addAttribute("sex","2");
        model.addAttribute("id","2");
        return "index2";
    }

    @RequestMapping("show3")
    public String showInfo3(Model model){
        List<Users> list = new ArrayList<>();
        list.add(new Users(1,"张三",18));
        list.add(new Users(2,"李四",20));
        list.add(new Users(3,"王五",22));
        model.addAttribute("list",list);
        return "index3";
    }

    @RequestMapping("show4")
    public String showInfo4(Model model){
        Map<String,Object> map = new HashMap<>();
        map.put("u1",new Users(1,"张三",18));
        map.put("u2",new Users(2,"李四",20));
        map.put("u3",new Users(3,"王五",22));
        model.addAttribute("map",map);
        return "index4";
    }

    @RequestMapping("show5")
    public String showInfo5(HttpServletRequest req,Model model){
        req.setAttribute("req","HttpServletRequest");
        req.getSession().setAttribute("sess","HttpSession");
        req.getSession().getServletContext().setAttribute("app","Application");
        return "index5";
    }

    @RequestMapping("{page}")
    public String showInfo6(@PathVariable String page,Integer id,String name){
        System.out.println(id+"--"+name);
        return page;
    }

}
