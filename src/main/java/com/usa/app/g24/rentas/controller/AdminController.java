package com.usa.app.g24.rentas.controller;

import com.usa.app.g24.rentas.dto.AdminRequest;
import com.usa.app.g24.rentas.model.Admin;
import com.usa.app.g24.rentas.service.AdminService;
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
@RequestMapping("Admin")
public class AdminController {
    
    @Autowired
    private AdminService service;
    
    /**
     * 
     * @param request
     * @return 
     */
    @PostMapping("save")
    public ResponseEntity<?> guardar(@RequestBody AdminRequest request) {
        try {
            service.guardar(request);
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
    public List<Admin> listaDeGamas() {
        return service.lista();
    }
    
    /**
     * 
     * @param id
     * @return 
     */
    @DeleteMapping("{id}")
    public ResponseEntity<?> eliminar(@PathVariable("id") Integer id) {
        try {
            service.eliminar(id);
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
    public ResponseEntity<?> actualizar(@RequestBody AdminRequest request) {
        try {
            service.actualizar(request);
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
    public Admin obtenerPorId(@PathVariable("id") Integer id) {
        return service.obtenerPorId(id);
    }
    
}
