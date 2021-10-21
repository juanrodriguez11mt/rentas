package com.usa.app.g24.rentas.controller;

import com.usa.app.g24.rentas.dto.CarRequest;
import com.usa.app.g24.rentas.model.Car;
import com.usa.app.g24.rentas.service.CarService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    
    /**
     * 
     * @param request
     * @return 
     */
    @PostMapping("save")
    public ResponseEntity<?> guardar(@RequestBody CarRequest request) {
        try {
            carService.guardar(request);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    /**
     * 
     * @return 
     */
    @GetMapping("all")
    public List<Car> listaDeCarros() {
        return carService.lista();
    }
    
    /**
     * 
     * @param id
     * @return 
     */
    @DeleteMapping("{id}")
    public ResponseEntity<?> eliminar(@PathVariable("id") Integer id) {
        try {
            carService.eliminar(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    /**
     * 
     * @param request
     * @return 
     */
    @PutMapping("update")
    public ResponseEntity<?> actualizar(@RequestBody CarRequest request) {
        try {
            carService.actualizar(request);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    /**
     * 
     * @param id
     * @return 
     */
    @GetMapping("{id}")
    public Car obtenerPorId(@PathVariable("id") Integer id) {
        return carService.obtenerPorId(id);
    }
    
}
