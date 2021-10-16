package com.usa.app.g24.rentas.service;

import com.usa.app.g24.rentas.dto.ReservationRequest;
import com.usa.app.g24.rentas.model.Car;
import com.usa.app.g24.rentas.model.Client;
import com.usa.app.g24.rentas.model.Reservation;
import com.usa.app.g24.rentas.repository.ReservationRepository;
import java.time.LocalDateTime;
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
    
    public void guardar(ReservationRequest request) {
        Car car = carService.obtenerPorId(request.getCar().getIdCar());
        Client client = clientService.obtenerPorId(request.getClient().getIdClient());
        
        Reservation reservation = new Reservation(null, 
                request.getStartDate().atStartOfDay(), request.getDevolutionDate().atStartOfDay(), 
                "created", car, client, null);
        
        repository.save(reservation);
    }
    
    public List<Reservation> lista() {
        return (List) repository.findAll();
    }
    
    public Reservation obtenerPorId(Integer id) {
        return repository.findById(id).orElse(null);
    }
    
}
