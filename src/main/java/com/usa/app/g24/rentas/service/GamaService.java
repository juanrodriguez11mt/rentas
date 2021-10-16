package com.usa.app.g24.rentas.service;

import com.usa.app.g24.rentas.dto.GamaRequest;
import com.usa.app.g24.rentas.model.Gama;
import com.usa.app.g24.rentas.repository.GamaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 57315
 */
@Service
public class GamaService {
    
    @Autowired
    private GamaRepository gamaRepository;
    
    public void guarar(GamaRequest request) {
        Gama gama = new Gama(null, request.getName(), request.getDescription());
        gamaRepository.save(gama);
    }
    
    public List<Gama> lista() {
        return (List) gamaRepository.findAll();
    }
    
}
