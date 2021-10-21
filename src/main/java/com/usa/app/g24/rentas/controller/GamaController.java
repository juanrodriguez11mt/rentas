package com.usa.app.g24.rentas.controller;

import com.usa.app.g24.rentas.dto.GamaRequest;
import com.usa.app.g24.rentas.model.Gama;
import com.usa.app.g24.rentas.service.GamaService;
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
 * Gama
 * @author 57315
 */
@RestController
@RequestMapping("Gama")
public class GamaController {
    
    @Autowired
    private GamaService gamaService;
    
    /**
     * 
     * @param request
     * @return 
     */
    @PostMapping("save")
    public ResponseEntity<?> guardar(@RequestBody GamaRequest request) {
        try {
            gamaService.guardar(request);
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
    public List<Gama> listaDeGamas() {
        return gamaService.lista();
    }
    
    /**
     * 
     * @param id
     * @return 
     */
    @DeleteMapping("{id}")
    public ResponseEntity<?> eliminar(@PathVariable("id") Integer id) {
        try {
            gamaService.eliminar(id);
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
    public ResponseEntity<?> actualizar(@RequestBody GamaRequest request) {
        try {
            gamaService.actualizar(request);
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
    public Gama obtenerPorId(@PathVariable("id") Integer id) {
        return gamaService.obtenerPorId(id);
    }
    
}
