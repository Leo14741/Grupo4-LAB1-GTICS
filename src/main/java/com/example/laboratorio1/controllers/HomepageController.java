package com.example.laboratorio1.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomepageController {


    @GetMapping("/homepage")
    public String home(){


        return "";
    }


}
