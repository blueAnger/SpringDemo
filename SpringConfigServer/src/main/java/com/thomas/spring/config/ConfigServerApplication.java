package com.thomas.spring.config;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by thomas on 17/8/14.
 */
@SpringCloudApplication
@EnableConfigServer
public class ConfigServerApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
