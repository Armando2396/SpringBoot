package com.example.Ejercicios.sesiones45.y6.controller;

import com.example.Ejercicios.sesiones45.y6.entities.Laptop;
import com.example.Ejercicios.sesiones45.y6.repository.LaptopRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LaptopController {

    private LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository laptopRepository){
        this.laptopRepository =laptopRepository;
    }

    //CRUD sobre la entidad Laptop

    //buscar todos los libros

    @GetMapping("/api/Laptop")
    public List<Laptop> findAll(){
        return laptopRepository.findAll();
    }

    //
    @PostMapping("/api/Laptop")
    public Laptop create(@RequestBody Laptop laptop){
        return laptopRepository.save(laptop);
    }

}
