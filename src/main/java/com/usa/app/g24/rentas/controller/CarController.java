package com.usa.app.g24.rentas.controller;

import com.usa.app.g24.rentas.model.Car;
import com.usa.app.g24.rentas.service.CarService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 57315
 */
@RestController
@RequestMapping("Car")
public class CarController {
    
    @Autowired
    private CarService carService;
    
    @PostMapping("save")
    public void guardar() {
        
    }
    
    @GetMapping("all")
    public List<Car> listaDeCarros() {
        return carService.lista();
    }
    
}
