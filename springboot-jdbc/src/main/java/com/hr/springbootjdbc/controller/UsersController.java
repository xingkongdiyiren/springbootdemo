package com.hr.springbootjdbc.controller;

import com.hr.springbootjdbc.pojo.Users;
import com.hr.springbootjdbc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author 周恒哲
 * @date 2019/12/13
 **/
@Controller
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private UsersService usersService;

    /**
     * 添加用户
     * @param users
     * @return
     */
   @GetMapping("/addUser")
    public String addUser(Users users){
       try {
           usersService.addUser(users);
       } catch (Exception e) {
           e.printStackTrace();
           return "error";
       }
       return "redirect:/ok";
   }
   @GetMapping("/showUser")
    public String showUser(Model model){
       List<Users> list=null;
       try {
           list=usersService.findAllUsers();
           model.addAttribute("list",list);
       } catch (Exception e) {
           e.printStackTrace();
           return  "error";
       }
       return "showUser";
   }
    @GetMapping("/preUpdateUser")
    public String preUpdateUser(Integer userid,Model model){
       try {
           Users users=usersService.selectUserById(userid);
           model.addAttribute("users",users);
       } catch (Exception e) {
           e.printStackTrace();
           return  "error";
       }
       return "updateUser";
   }
    @PostMapping("/updateUser")
    public String updateUser(Users users){
       try {
           usersService.updateUser(users);
       } catch (Exception e) {
           e.printStackTrace();
           return  "error";
       }
       return "redirect:/ok";
   }
    @GetMapping("/deleteUser")
    public String deleteUser(Integer userid){
       try {
           usersService.deleteUser(userid);
       } catch (Exception e) {
           e.printStackTrace();
           return  "error";
       }
       return "redirect:/ok";
   }

}
