package com.usa.app.g24.rentas.controller;

import com.usa.app.g24.rentas.dto.ReservationRequest;
import com.usa.app.g24.rentas.model.Reservation;
import com.usa.app.g24.rentas.service.ReservationService;
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
@RequestMapping("Reservation")
public class ReservationController {
    
    @Autowired
    private ReservationService service;
    
    /**
     * 
     * @param request
     * @return 
     */
    @PostMapping("save")
    public ResponseEntity<?> guardar(@RequestBody ReservationRequest request) {
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
    public List<Reservation> listaDeGamas() {
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
    public ResponseEntity<?> actualizar(@RequestBody ReservationRequest request) {
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
    public Reservation obtenerPorId(@PathVariable("id") Integer id) {
        return service.obtenerPorId(id);
    }
    
    /**
     * 
     * @param dateOne
     * @param dateTwo
     * @return 
     */
    @GetMapping("report-dates/{dateOne}/{dateTwo}")
    public List<Reservation> getReservationsReportDates(
            @PathVariable("dateOne") String dateOne, 
            @PathVariable("dateTwo") String dateTwo) {
        return service.getReservationsPeriod(dateOne, dateTwo);
    }
    
}
