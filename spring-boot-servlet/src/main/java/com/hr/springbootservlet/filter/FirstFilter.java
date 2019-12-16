package com.hr.springbootservlet.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 *SpringBoot整合Filter 方式一
 *<filter>
 *	<filter-name>FirstFilter</filter-name>
 *	<filter-class>com.bjsxt.filter.FirstFilter</filter-class>
 *</filter>
 *<filter-mapping>
 *	<filter-name>FirstFilter</filter-name>
 *	<url-pattern>/first</url-pattern>
 *</filter-mapping>
 */
//@WebFilter(filterName="FirstFilter",urlPatterns={"*.do","*.jsp"})
 @WebFilter(filterName = "firstFilter",urlPatterns = "/first")
public class FirstFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter初始化");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入filter");
        filterChain.doFilter(request,response);
        System.out.println("离开filter");
    }

    @Override
    public void destroy() {
        System.out.println("Filter销毁");
    }
}
