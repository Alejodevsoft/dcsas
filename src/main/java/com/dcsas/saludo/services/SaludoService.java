package com.dcsas.saludo.services;

import org.springframework.stereotype.Service;

@Service
public class SaludoService {
    public String generarSaludo(String name){
        if (name==null || name.isEmpty() || name.equals("")){
            return "Hola,usuario desconocido";
        }else{
            return new StringBuilder().append("Hola, ").append(name).toString();
        }
    }
}
