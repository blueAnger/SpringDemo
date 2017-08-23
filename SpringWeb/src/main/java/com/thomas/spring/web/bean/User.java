package com.thomas.spring.web.bean;

/**
 * Created by thomas on 17/8/22.
 */
public class User
{
    private String name;
    private String password;

    public User(){}

    public User(String name, String password)
    {
        this.name = name;
        this.password = password;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}
