package com.example.Ejerciciosesiones456.controller;

import com.example.Ejerciciosesiones456.entities.Laptops;
import com.example.Ejerciciosesiones456.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
public class LaptopController {

    @Value("${app.message}")
    String message;

    // atributos

    private LaptopRepository laptopRepository;



    // constructores


    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    @GetMapping("/sesion12/findallcomputers")
    public List<Laptops> findAll(){
        System.out.println(message);
        return laptopRepository.findAll();
    }

    @PostMapping("/api/computadores")
    public Laptops create(@RequestBody Laptops laptop, @RequestHeader HttpHeaders headers){
        return laptopRepository.save(laptop);
    }
}
