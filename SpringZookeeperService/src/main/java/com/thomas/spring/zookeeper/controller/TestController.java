package com.thomas.spring.zookeeper.controller;

import com.thomas.spring.zookeeper.bean.User;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by thomas on 17/8/22.
 */
@RestController
//@RequestMapping("/test")
public class TestController
{
    @RequestMapping("/user")
    public User getUser(@RequestParam String user, @RequestParam String password)
    {
        return new User(user, DigestUtils.md5DigestAsHex(password.getBytes()));
    }

}
