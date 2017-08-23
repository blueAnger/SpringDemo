package com.thomas.spring.zookeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by thomas on 17/8/22.
 */

@SpringBootApplication
@EnableDiscoveryClient
public class SpringZookeeperService
{
    public static void main(String[] args)
    {
        SpringApplication.run(SpringZookeeperService.class, args);
    }
}
