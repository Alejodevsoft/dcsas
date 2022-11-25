package com.dcsas.saludo.controllers;

import com.dcsas.saludo.services.SaludoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludo")
public class Saludo {
    @Autowired
    SaludoService saludoService;

    @PostMapping()
    public String saludar(@RequestParam String name){
        return saludoService.generarSaludo(name);
    }
}
