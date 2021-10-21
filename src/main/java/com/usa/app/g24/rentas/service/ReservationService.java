package com.usa.app.g24.rentas.service;

import com.usa.app.g24.rentas.dto.ReservationRequest;
import com.usa.app.g24.rentas.model.Car;
import com.usa.app.g24.rentas.model.Client;
import com.usa.app.g24.rentas.model.Reservation;
import com.usa.app.g24.rentas.repository.ReservationRepository;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 57315
 */
@Service
public class ReservationService {
    
    @Autowired
    private ReservationRepository repository;
    
    @Autowired
    private CarService carService;
    
    @Autowired
    private ClientService clientService;
    
    @Autowired
    private ScoreService scoreService;
    
    /**
     * 
     * @param request 
     */
    public void guardar(ReservationRequest request) {
        Car car = carService.obtenerPorId(request.getCar().getIdCar());
        Client client = clientService.obtenerPorId(request.getClient().getIdClient());
        
        Reservation reservation = new Reservation(null, fromLocalDateToDate(request.getStartDate()), 
                fromLocalDateToDate(request.getDevolutionDate()), "created", car, client, null);
        
        repository.save(reservation);
    }
    
    /**
     * 
     * @return 
     */
    public List<Reservation> lista() {
        return (List) repository.findAll();
    }
    
    /**
     * 
     * @param id
     * @throws Exception 
     */
    public void eliminar(Integer id) throws Exception {
        Reservation entity = obtenerPorId(id);
        if (entity == null) {
            throw new Exception ("El elemento no existe");
        }
        
        scoreService.eliminar(entity.getScore().getIdScore());
        
        this.repository.delete(entity);
    }
    
    /**
     * 
     * @param id
     * @return 
     */
    public Reservation obtenerPorId(Integer id) {
        return this.repository.findById(id).orElse(null);
    }
    
    /**
     * 
     * @param request
     * @throws Exception 
     */
    public void actualizar(ReservationRequest request) throws Exception {
        Reservation entity = obtenerPorId(request.getIdReservation());
        if (entity == null) {
            throw new Exception ("El elemento no existe");
        }
        
        entity.setDevolutionDate(fromLocalDateToDate(request.getDevolutionDate()));
        entity.setStartDate(fromLocalDateToDate(request.getStartDate()));
        
        repository.save(entity);
    }
    
    /**
     * 
     * @param initDate
     * @param finishDate
     * @return 
     */
    public List<Reservation> getReservationsPeriod (String initDate,
            String finishDate) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date a = format.parse(initDate);
            Date b = format.parse(finishDate);
            
            if (a.before(b)) {
                return repository.findAllByStartDateAfterAndStartDateBefore(a, b);
            }
        } catch (Exception e) {
            
        }
        
        return new ArrayList<>();
    }
    
    /**
     * 
     * @param date
     * @return 
     */
    private Date fromLocalDateToDate(LocalDate date) {
        return java.sql.Date.valueOf(date);
    }
    
}
