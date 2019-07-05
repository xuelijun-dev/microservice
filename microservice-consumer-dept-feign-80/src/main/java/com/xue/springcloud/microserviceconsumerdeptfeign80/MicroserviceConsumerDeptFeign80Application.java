package com.xue.springcloud.microserviceconsumerdeptfeign80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.xue.springcloud"})
@ComponentScan("com.xue.springcloud")
public class MicroserviceConsumerDeptFeign80Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceConsumerDeptFeign80Application.class, args);
    }

}
