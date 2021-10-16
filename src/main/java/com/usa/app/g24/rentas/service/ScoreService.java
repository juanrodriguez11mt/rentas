package com.usa.app.g24.rentas.service;

import com.usa.app.g24.rentas.dto.ScoreRequest;
import com.usa.app.g24.rentas.model.Reservation;
import com.usa.app.g24.rentas.model.Score;
import com.usa.app.g24.rentas.repository.ScoreRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 57315
 */
@Service
public class ScoreService {
    
    @Autowired
    private ScoreRepository repository;
    
    @Autowired
    private ReservationService reservationService;
    
    public void guardar(ScoreRequest request) {
        Reservation res = reservationService
                .obtenerPorId(request.getReservation().getIdReservation());
        
        Score score = new Score(null, request.getMessageText(), 
                request.getStars(), res);
        
        repository.save(score);
    }
    
    public List<Score> lista() {
        return (List) repository.findAll();
    }
    
}
