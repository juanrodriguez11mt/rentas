package com.usa.app.g24.rentas.controller;

import com.usa.app.g24.rentas.dto.MessageRequest;
import com.usa.app.g24.rentas.model.Message;
import com.usa.app.g24.rentas.service.MessageService;
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
@RequestMapping("Message")
public class MessageController {
    
    @Autowired
    private MessageService service;
    
    @PostMapping("save")
    public ResponseEntity<?> guardar(@RequestBody MessageRequest request) {
        try {
            service.guardar(request);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @GetMapping("all")
    public List<Message> listaDeGamas() {
        return service.lista();
    }
    
    @DeleteMapping("{id}")
    public ResponseEntity<?> eliminar(@PathVariable("id") Integer id) {
        try {
            service.eliminar(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @PutMapping("update")
    public ResponseEntity<?> actualizar(@RequestBody MessageRequest request) {
        try {
            service.actualizar(request);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @GetMapping("{id}")
    public Message obtenerPorId(@PathVariable("id") Integer id) {
        return service.obtenerPorId(id);
    }
    
}
