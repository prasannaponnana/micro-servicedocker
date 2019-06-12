package com.stackroute.muzixservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableCaching
@EnableEurekaClient
@SpringBootApplication
public class MuzixserviceApplication {

    public static void main(String[] args) {SpringApplication.run(MuzixserviceApplication.class, args);
    }
}
