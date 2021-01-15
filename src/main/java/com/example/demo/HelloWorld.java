package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class HelloWorld {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello() {
        return "HelloWorld!!!!";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "注册成功";
    }
}
