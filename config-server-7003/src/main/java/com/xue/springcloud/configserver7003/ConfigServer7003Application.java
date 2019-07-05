package com.xue.springcloud.configserver7003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ConfigServer7003Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServer7003Application.class, args);
    }

}
