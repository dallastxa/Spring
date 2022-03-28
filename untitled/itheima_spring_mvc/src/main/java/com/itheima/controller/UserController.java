package com.itheima.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    //请求地址
    @RequestMapping("/quick")
    public String save(){
        System.out.println("Controller save running");
        return "/success.jsp";
    }
}
