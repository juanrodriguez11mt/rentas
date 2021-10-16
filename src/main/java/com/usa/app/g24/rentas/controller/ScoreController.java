package com.usa.app.g24.rentas.controller;

import com.usa.app.g24.rentas.dto.ScoreRequest;
import com.usa.app.g24.rentas.model.Score;
import com.usa.app.g24.rentas.service.ScoreService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 57315
 */
@RestController
@RequestMapping("Score")
public class ScoreController {
    
    @Autowired
    private ScoreService service;
    
    @PostMapping("save")
    public ResponseEntity<?> guardar(@RequestBody ScoreRequest request) {
        try {
            service.guardar(request);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @GetMapping("all")
    public List<Score> listaDeGamas() {
        return service.lista();
    }
}
