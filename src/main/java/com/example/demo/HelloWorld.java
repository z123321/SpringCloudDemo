package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

@RestController
@RequestMapping("/login")
public class HelloWorld {
    @RequestMapping (value = "/hello",method = RequestMethod.GET)
    public String sayHello(){

        return "HelloWorld!!!!";
    }

}
