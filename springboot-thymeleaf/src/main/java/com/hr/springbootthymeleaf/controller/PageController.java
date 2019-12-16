package com.hr.springbootthymeleaf.controller;

import com.hr.springbootthymeleaf.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * @author 周恒哲
 * @date 2019/12/12
 **/
@Controller
public class PageController {

    @GetMapping("/show")
    public String showPage(Model model, HttpServletRequest request){
        model.addAttribute("msg","Hello Thymeleaf");
        model.addAttribute("date",new Date());
        model.addAttribute("sex","男");
        model.addAttribute("id",6);
        List<Users> list=new ArrayList<>();
        list.add(new Users("1","admin",23));
        list.add(new Users("2","开心",24));
        list.add(new Users("3","快乐",22));
        list.add(new Users("4","我喜A欢你",22));
        list.add(new Users("5","我想做你男朋友",22));
        list.add(new Users("6","做我女朋友吧",22));
        model.addAttribute("list",list);
        Map<String,Users> map=new HashMap<String,Users>();
        map.put("user1",new Users("1","admin",23));
        map.put("user2",new Users("2","开心",24));
        map.put("user3",new Users("3","快乐",22));
        map.put("user4",new Users("4","我喜欢你",22));
        map.put("user5",new Users("5","我想做你男朋友",22));
        map.put("user6",new Users("6","做我女朋友吧",22));
        model.addAttribute("map",map);
        request.setAttribute("req","HttpServletRequest");
        request.getSession().setAttribute("ses","HttpSession");
        request.getSession().getServletContext().setAttribute("app","application");
        return "index";
    }

    @GetMapping("/show2")
    public String show2(){
        return "index2";
    }
}
