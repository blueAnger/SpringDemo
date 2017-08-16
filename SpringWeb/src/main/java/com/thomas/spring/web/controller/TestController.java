package com.thomas.spring.web.controller;

import com.thomas.spring.web.bean.JdbcProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by thomas on 17/8/16.
 */
@RestController
public class TestController
{
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public JdbcProperties test()
    {
        return restTemplate.getForObject("http://spring-service/test/jdbc", JdbcProperties.class);
    }

}
