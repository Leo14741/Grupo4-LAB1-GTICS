package com.example.laboratorio1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Registro {
    @GetMapping(value = "/newUser")
    public String registrar() {
        return "registro_usuario";
    }

}
