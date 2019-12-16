package com.hr.springbootexcepionandjunit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
    @ExceptionHandler(value = java.lang.NullPointerException.class)
    public ModelAndView nullpointExceptionHandler(Exception e){
        ModelAndView mv=new ModelAndView();
        mv.addObject("err",e.toString());
        mv.setViewName("error1");
        return mv;
    }
}
