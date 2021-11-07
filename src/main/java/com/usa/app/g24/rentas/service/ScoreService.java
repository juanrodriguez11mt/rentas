package com.usa.app.g24.rentas.service;

import com.usa.app.g24.rentas.dto.ScoreRequest;
import com.usa.app.g24.rentas.model.Reservation;
import com.usa.app.g24.rentas.model.Score;
import com.usa.app.g24.rentas.repository.ScoreRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    
    /**
     * 
     * @param request 
     */
    public void guardar(ScoreRequest request) {
        Reservation res = reservationService
                .obtenerPorId(request.getReservation().getIdReservation());
        
        Score score = new Score(null, request.getMessageText(), 
                request.getStars(), res);
        
        repository.save(score);
    }
    
    /**
     * 
     * @return 
     */
    public List<Score> lista() {
        return (List) repository.findAll();
    }
    
    /**
     * 
     * @param id
     * @throws Exception 
     */
    public void eliminar(Integer id) throws Exception {
        Score entity = obtenerPorId(id);
        if (entity == null) {
            throw new Exception ("El elemento no existe");
        }
        this.repository.delete(entity);
    }
    
    /**
     * 
     * @param id
     * @return 
     */
    public Score obtenerPorId(Integer id) {
        return this.repository.findById(id).orElse(null);
    }
    
    /**
     * 
     * @param request
     * @throws Exception 
     */
    public void actualizar(ScoreRequest request) throws Exception {
        Score entity = obtenerPorId(request.getIdScore());
        if (entity == null) {
            throw new Exception ("El elemento no existe");
        }
        
        entity.setMessageText(request.getMessageText());
        entity.setStars(request.getStars());
        
        repository.save(entity);
    }
    
}
