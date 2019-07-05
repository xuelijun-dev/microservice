package com.xue.springcloud.microserviceproviderdept8001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class MicroserviceProviderDept8001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceProviderDept8001Application.class, args);
    }

}
