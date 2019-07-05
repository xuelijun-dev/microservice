package com.xue.springcloud.microservicezuulgateway9527;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class MicroserviceZuulGateway9527Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceZuulGateway9527Application.class, args);
    }

}
