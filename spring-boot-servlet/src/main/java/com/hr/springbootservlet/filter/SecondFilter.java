package com.hr.springbootservlet.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 *
 *SpringBoot整合Filter 方式二
 *
 */
public class SecondFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter初始化");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入filter");
        filterChain.doFilter(request,response);
        System.out.println("离开filter");
    }

    @Override
    public void destroy() {
        System.out.println("Filter销毁");
    }
}
