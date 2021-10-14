package com.usa.app.g24.rentas.controller;

import com.usa.app.g24.rentas.repository.GamaRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Gama
 * @author 57315
 */
@RestController
@RequestMapping("Gama")
public class GamaController {
    
    @Autowired
    private GamaRepository repository;
    
    @PostMapping("save")
    public void guardar() {
        
    }
    
    @GetMapping("all")
    public List listaDeGamas() {
        return (List) repository.findAll();
    }
    
}
