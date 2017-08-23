package com.thomas.spring.web.controller;

import com.thomas.spring.web.bean.JdbcProperties;
import com.thomas.spring.web.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

/**
 * Created by thomas on 17/8/16.
 */
@RestController
@RequestMapping("/test")
public class TestController
{
    @Autowired
    private RestTemplate restTemplate;

    //zookeeper
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public User test(@RequestParam String user, @RequestParam String password)
    {
        MultiValueMap<String, String> multiValueMap = new LinkedMultiValueMap<>();
        multiValueMap.put("user", Collections.singletonList(user));
        multiValueMap.put("password", Collections.singletonList(password));

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        HttpEntity httpEntity = new HttpEntity<>(multiValueMap, httpHeaders);

        return restTemplate.postForObject("http://spring-zookeeper-service/user", httpEntity, User.class);
    }

    //eureka
    @RequestMapping(value = "/jdbc", method = RequestMethod.GET)
    public JdbcProperties test()
    {
        return restTemplate.getForObject("http://spring-service/test/jdbc", JdbcProperties.class);
    }

}
