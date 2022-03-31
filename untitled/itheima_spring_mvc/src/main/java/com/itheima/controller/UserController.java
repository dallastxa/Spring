package com.itheima.controller;

import com.alibaba.fastjson.JSON;
import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.Servlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value="/quick12")
    @ResponseBody
    public void save12(User user) {
        System.out.println(user);
    }
    @RequestMapping(value="/quick11")
    @ResponseBody
    public void save11(String username,int age) {
        System.out.println(username);
        System.out.println(age);
    }

    @RequestMapping(value="/quick10")
    @ResponseBody//告知spingMVC框架 不进行视图跳转 直接进行数据响应
    //期望SpringMVC自动将User转换成json格式字符串
    public User save10() throws IOException {
        User user=new User();
        user.setName("lisi");
        user.setAge(32);

        return user;
    }


    @RequestMapping(value="/quick9")
    @ResponseBody//告知spingMVC框架 不进行视图跳转 直接进行数据响应
    public String save9() throws IOException {
        User user=new User();
        user.setName("lisi");
        user.setAge(30);
        //使用json的转换工具将对象转化为json格式字符串
        String json= JSON.toJSONString(user);

        return json;
    }


    @RequestMapping(value="/quick8")
    @ResponseBody//告知spingMVC框架 不进行视图跳转 直接进行数据响应
    public String save8() throws IOException {

        return "{\"usrname\":\"zhangsan\",\"age\":18}";
    }


    @RequestMapping(value="/quick7")
    @ResponseBody//告知spingMVC框架 不进行视图跳转 直接进行数据响应
    public String save7() throws IOException {

       return "hello itheima";
    }

    @RequestMapping(value="/quick6")
    public void save6(HttpServletResponse response) throws IOException {
        response.getWriter().print("hello itcast");

    }

    @RequestMapping(value="/quick5")
    public String save5(HttpServletRequest request){
        request.setAttribute("username","不知道");
        return "success";
    }

    @RequestMapping(value="/quick4")
    public String save4(Model model){
        model.addAttribute("username","哈啊哈");
        return "success";
    }

    @RequestMapping(value="/quick3")
    public ModelAndView save3(ModelAndView modelAndView){
        modelAndView.addObject("username","itheima");
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping(value="/quick2")
    public ModelAndView save2(){
        /*
        * model:模型 作用封装数据
        * view:视图 作用展示数据
        * */
        ModelAndView modelAndView=new ModelAndView();
        //设置视图名称
        modelAndView.setViewName("success");
        //设置模型数据
        modelAndView.addObject("username","itcast");
        return modelAndView;
    }
    //请求地址
    @RequestMapping(value="/quick",method = RequestMethod.GET/*,params = {"userName"}*/)
    public String save(){
        System.out.println("Controller save running");
        return "success";
    }
}
