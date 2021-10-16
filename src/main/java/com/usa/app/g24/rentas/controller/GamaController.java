package com.usa.app.g24.rentas.controller;

import com.usa.app.g24.rentas.dto.GamaRequest;
import com.usa.app.g24.rentas.model.Gama;
import com.usa.app.g24.rentas.service.GamaService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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
    private GamaService gamaService;
    
    @PostMapping("save")
    public void guardar(@RequestBody GamaRequest request) {
        gamaService.guarar(request);
    }
    
    @GetMapping("all")
    public List<Gama> listaDeGamas() {
        return gamaService.lista();
    }
    
}
