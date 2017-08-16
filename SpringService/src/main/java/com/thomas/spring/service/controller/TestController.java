package com.thomas.spring.service.controller;

import com.thomas.spring.service.bean.JdbcProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by thomas on 17/8/14.
 */
@RestController
@RequestMapping(value = "/test")
public class TestController
{
    @Autowired
    private JdbcProperties jdbcProperties;

    @RequestMapping(value = "/jdbc", method = RequestMethod.GET)
    public JdbcProperties getConfig()
    {
        return jdbcProperties;
    }

}
