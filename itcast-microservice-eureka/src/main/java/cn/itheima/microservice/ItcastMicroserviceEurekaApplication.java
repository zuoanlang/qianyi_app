package cn.itheima.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ItcastMicroserviceEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItcastMicroserviceEurekaApplication.class, args);
    }

}

