package com.offcn.controller;


import com.offcn.pojo.User;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

//    获取所有用户
    @GetMapping("/")
    public String getAllUser(Model model){
        List<User> allUser = userService.getAllUser();
        model.addAttribute("allUser",allUser);
//        返回值得内容是前端页面的路径
        return "User/list";
    }

//    获取单个用户（回显）
    @GetMapping("/{id}")
    public String getOneUser(@PathVariable Long id,Model model){
        User user = userService.getOneUser(id);
        model.addAttribute("user",user);
        return "User/userEdit";
    }

//    添加用户
    @PostMapping("/")
    public String addUser(User user){
        userService.addUser(user);
        return "redirect:/user/";   //重定向到列表页
    }

    @PutMapping("/{id}")
    public String update(@PathVariable Long id,User user){
        userService.update(id,user);
        return "redirect:/user/";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        userService.delete(id);
        return "redirect:/user/";
    }

}
