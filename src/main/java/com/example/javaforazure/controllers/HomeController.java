package com.example.javaforazure.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public  String Index(){
        return "home/index";
    }

    @GetMapping(value = "/welcome")
    public String Welcome() {
        return "home/welcome";
    }
}
