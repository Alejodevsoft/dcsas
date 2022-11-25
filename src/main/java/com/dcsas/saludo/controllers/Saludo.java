package com.dcsas.saludo.controllers;

import com.dcsas.saludo.services.SaludoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/saludo")
public class Saludo {
    @Autowired
    SaludoService saludoService;

    @PostMapping()
    public String saludar(@RequestBody Map<String,String> params){
        return saludoService.generarSaludo(params.get("name"));
    }
}
