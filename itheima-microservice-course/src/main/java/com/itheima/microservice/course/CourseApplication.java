package com.itheima.microservice.course;

import com.itheima.microservice.course.util.SpringContextUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages={"com.itheima.microservice"})
@MapperScan("com.itheima.microservice.course.mapper")
public class CourseApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(CourseApplication.class, args);
        SpringContextUtils.setApplicationContext(applicationContext);
    }

}

