package com.edusol.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo_controller {
    @RequestMapping("/hello")
    public String Hello(){
        return "hello to you too";
    }
}
