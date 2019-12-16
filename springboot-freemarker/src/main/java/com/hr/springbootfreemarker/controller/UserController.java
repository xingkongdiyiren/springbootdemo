package com.hr.springbootfreemarker.controller;

import com.hr.springbootfreemarker.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 周恒哲
 * @date 2019/12/12
 **/
@Controller
public class UserController {
    /**
     * 处理请求，返回数据
     */
    @GetMapping("/showUsers")
    public String showUsers(Model model){
        List<Users> list=new ArrayList<Users>();
        list.add(new Users("zhz","M","20"));
        list.add(new Users("zhz1","M1","21"));
        list.add(new Users("zhz2","M1","22"));
        model.addAttribute("list",list);
        return  "usersList";
    }
}
