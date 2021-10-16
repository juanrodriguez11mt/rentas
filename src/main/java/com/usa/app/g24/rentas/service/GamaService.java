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
    
    public void guardar(GamaRequest request) throws Exception {
        if (existeGama(request.getName())) {
            throw new Exception("Gama ya existe");
        }
        
        Gama gama = new Gama(null, request.getName(), request.getDescription());
        gamaRepository.save(gama);
    }
    
    public List<Gama> lista() {
        return (List) gamaRepository.findAll();
    }
    
    public Gama gamaPorId(Integer id) {
        return gamaRepository.findById(id).orElse(null);
    }
    
    private boolean existeGama(String nombre) {
        Gama gama = gamaRepository.findByName(nombre);
        if (gama == null) {
            return false;
        } else {
            return true;
        }
    }
    
}
