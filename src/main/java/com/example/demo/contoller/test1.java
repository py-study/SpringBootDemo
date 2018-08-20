package com.example.demo.contoller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test1 {

    @Value("${com.neo.title}")
    private String title;
    @Value("${com.neo.description}")
    private String description;

    @RequestMapping("/f1")
    public String test(){
        return "dafalla ewofwo fewofwo fewoooo fwofwo 你好：" + title + " " + description;
    }
}
