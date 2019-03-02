package com.itheima.microservice.course;

import com.github.pagehelper.PageHelper;
import com.itheima.microservice.course.util.SpringContextUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Properties;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages={"com.itheima.microservice"})
@MapperScan("com.itheima.microservice.course.mapper")
public class CourseApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(CourseApplication.class, args);
        SpringContextUtils.setApplicationContext(applicationContext);
    }

    //配置mybatis的分页插件pageHelper
    @Bean
    public PageHelper pageHelper(){
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("offsetAsPageNum","true");
        properties.setProperty("rowBoundsWithCount","true");
        properties.setProperty("reasonable","true");
        properties.setProperty("dialect","mysql");    //配置mysql数据库的方言
        pageHelper.setProperties(properties);
        return pageHelper;
    }

}

