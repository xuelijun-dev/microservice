package com.xue.springcloud.configserver7001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ConfigServer7001Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServer7001Application.class, args);
    }

}
