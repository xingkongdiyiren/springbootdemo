package com.hr.springbootmybatis.controller;

import com.hr.springbootmybatis.pojo.Users;
import com.hr.springbootmybatis.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 用户管理Controller
 */
@Controller
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private UsersService usersService;
    /**
     * 添加用户
     */
    @PostMapping("/addUser")
    public String addUsers(Users users){
        try{
            this.usersService.addUsers(users);
        }catch(Exception e){
            e.printStackTrace();
            return "error";
        }
        return "redirect:/ok";
    }

    /**
     * 查询全部用户
     */
    @GetMapping("/findUserAll")
    public String findUserAll(Model model){
        try{
            List<Users> list = this.usersService.findUserAll();
            model.addAttribute("list",list);
        }catch(Exception e){
            e.printStackTrace();
            return "error";
        }
        return "showUsers";
    }

    /**
     * 预更新用户查询
     */
    @GetMapping("/preUpdateUser")
    public String preUpdateUser(Integer id,Model model){
        try{
            Users user = this.usersService.preUpdateUsers(id);
            model.addAttribute("user",user);
        }catch(Exception e){
            e.printStackTrace();
            return "error";
        }
        return "updateUser";
    }

    /**
     * 更新用户
     */
    @PostMapping("/updateUser")
    public String updateUser(Users users){
        try{
            this.usersService.modifyUsers(users);
        }catch(Exception e){
            e.printStackTrace();
            return "error";
        }
        return "redirect:/ok";
    }

    /**
     * 删除用户
     */
    @GetMapping("/deleteUser")
    public String deleteUser(Integer id){
        try{
            this.usersService.dropUsersById(id);
        }catch(Exception e){
            e.printStackTrace();
            return "error";
        }
        return "redirect:/ok";
    }
}
