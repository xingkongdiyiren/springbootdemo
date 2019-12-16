package com.hr.springbootservlet.filterservlet;

import com.hr.springbootservlet.filter.SecondFilter;
import com.hr.springbootservlet.listener.SecondListener;
import com.hr.springbootservlet.servlet.SecondServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * @author 周恒哲
 * @date 2019/12/09
 **/
@SpringBootApplication
public class SpringBootServletApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootServletApplication2.class,args);
    }
    /**
     * 注册Servlet
     * @return
     */
    @Bean
    public ServletRegistrationBean getServletRegistrationBean(){
        ServletRegistrationBean bean=new ServletRegistrationBean(new SecondServlet());
        bean.addUrlMappings("/second");
        return bean;
    }
    /**
     * 注册Filter
     * @return
     */
    @Bean
    public FilterRegistrationBean getFilterRegistrationBean(){
        FilterRegistrationBean bean=new FilterRegistrationBean(new SecondFilter());
        bean.addUrlPatterns("/second");
        return bean;
    }
    /**
     * 注册listener
     */
    @Bean
    public ServletListenerRegistrationBean<SecondListener> getServletListenerRegistrationBean(){
        ServletListenerRegistrationBean<SecondListener> bean=new ServletListenerRegistrationBean<SecondListener>(new SecondListener());
        return bean;
    }

}
