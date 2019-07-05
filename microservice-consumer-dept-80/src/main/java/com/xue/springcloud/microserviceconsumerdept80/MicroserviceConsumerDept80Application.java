package com.xue.springcloud.microserviceconsumerdept80;

import com.xue.springcloud.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@EnableEurekaClient
@SpringBootApplication
@RibbonClient(value = "MICROSERVICE-PROVIDER-DEPT",configuration = MySelfRule.class)
public class MicroserviceConsumerDept80Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceConsumerDept80Application.class, args);
    }

}
