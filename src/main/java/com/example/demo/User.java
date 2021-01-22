package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@Controller
@RequestMapping("/user")
public class User {
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @ResponseBody
    public String login() {
        ArrayList<Book> list=new ArrayList();
        for(int i=0;i<50;i++){
            list.add(new Book("isbn"+i,"title"+i));
        }
        return list.toString();

    }



}
