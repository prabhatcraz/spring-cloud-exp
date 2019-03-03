package com.spring.cloud.practice.beers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BeersApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeersApplication.class, args);
    }

}
