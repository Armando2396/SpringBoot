package com.example.Ejercicios.sesiones45.y6.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/api/hola")
    public String holamundo(){
        return "hola mundo";
    }
}
