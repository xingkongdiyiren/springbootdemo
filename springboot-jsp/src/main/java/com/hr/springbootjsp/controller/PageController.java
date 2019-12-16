package com.hr.springbootjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 页面跳转Controller
 * @author 周恒哲
 * @date 2019/12/11
 **/
@Controller
public class PageController {

    @GetMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }
}
