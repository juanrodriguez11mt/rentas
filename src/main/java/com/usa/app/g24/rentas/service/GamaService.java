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
    
    /**
     * 
     * @param request
     * @throws Exception 
     */
    public void guardar(GamaRequest request) throws Exception {
        if (existeGama(request.getName())) {
            throw new Exception("Gama ya existe");
        }
        
        Gama gama = new Gama(null, request.getName(), request.getDescription());
        gamaRepository.save(gama);
    }
    
    /**
     * 
     * @return 
     */
    public List<Gama> lista() {
        return (List) gamaRepository.findAll();
    }
    
    /**
     * 
     * @param id 
     * @exception Exception
     */
    public void eliminar(Integer id) throws Exception {
        Gama gama = obtenerPorId(id);
        if (gama == null) {
            throw new Exception ("El elemento no existe");
        }
        
        if (!gama.getCars().isEmpty()) {
            throw new Exception ("La gama carros relacionados");
        }
        
        gamaRepository.delete(gama);
    }
    
    /**
     * 
     * @param id
     * @return 
     */
    public Gama obtenerPorId(Integer id) {
        return gamaRepository.findById(id).orElse(null);
    }
    
    /**
     * 
     * @param request
     * @throws Exception 
     */
    public void actualizar(GamaRequest request) throws Exception {
        Gama entity = obtenerPorId(request.getIdGama());
        if (entity == null) {
            throw new Exception ("El elemento no existe");
        }
        
        entity.setDescription(request.getDescription());
        entity.setName(request.getName());
        
        gamaRepository.save(entity);
    }
    
    /**
     * 
     * @param nombre
     * @return 
     */
    private boolean existeGama(String nombre) {
        Gama gama = gamaRepository.findByName(nombre);
        if (gama == null) {
            return false;
        } else {
            return true;
        }
    }
    
}
