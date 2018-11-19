package com.gu.springdemo1.sys.controller;

import com.gu.springdemo1.sys.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/list")
    public String listUser(Model model){
        List<User> list = new ArrayList<User>();
        for (int i=0; i<10;i++){
            list.add(new User(i+"","张三"+i,20+i,"北京"+i));
        }
        model.addAttribute("users",list);
        return "index";
    }
}
