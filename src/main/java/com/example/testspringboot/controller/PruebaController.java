package com.example.testspringboot.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PruebaController {
    
    @GetMapping("/bienvenido/")
    public String mostrarBienvenida(Model modelo){
        System.out.println("##### Ingreso a bienvenida ####");
        String nombUsuario = "Jorge Fabian "; 
        modelo.addAttribute("nombre", nombUsuario) ; 
        System.out.println("##### antes return ####");
        return "inicio"; 
    }
}
