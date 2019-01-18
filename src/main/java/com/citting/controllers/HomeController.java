package com.citting.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@Controller
public class HomeController {



    @GetMapping("/")
    public String start()
    {
        return "start";
    }


    @GetMapping("/home")
    public String home2()
    {
        return "home";
    }


}
