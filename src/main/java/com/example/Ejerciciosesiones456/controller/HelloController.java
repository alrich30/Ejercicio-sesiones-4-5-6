package com.example.Ejerciciosesiones456.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/sesion6")
    public String HolaMundo() {
        return  "Hola, me llamo Stephen Curry";
    }
}
