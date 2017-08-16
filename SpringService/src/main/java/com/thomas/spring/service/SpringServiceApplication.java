package com.thomas.spring.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * Created by thomas on 17/8/14.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class SpringServiceApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(SpringServiceApplication.class, args);
    }

}
