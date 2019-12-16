package com.hr.springbootservlet.filterservlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * SpringBoot整合Servlet，filter，listener方式一
 */
@SpringBootApplication
@ServletComponentScan  //在springBoot启动时会扫描@WebServlet，并将该类实例化
public class SpringBootServletApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootServletApplication.class, args);
    }

}
