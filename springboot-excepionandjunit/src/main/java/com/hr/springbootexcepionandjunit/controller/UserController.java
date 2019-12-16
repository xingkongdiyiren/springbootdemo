package com.hr.springbootexcepionandjunit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 周恒哲
 * @date 2019/12/16
 **/
@Controller
public class UserController {

    @RequestMapping("/showInfo")
    public String showInfo(){
        String str = null;
        str.length();
        return "ok";
    }
}
