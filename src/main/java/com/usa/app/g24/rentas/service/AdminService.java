package com.usa.app.g24.rentas.service;

import com.usa.app.g24.rentas.dto.AdminRequest;
import com.usa.app.g24.rentas.model.Admin;
import com.usa.app.g24.rentas.repository.AdminRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 57315
 */
@Service
public class AdminService {
    
    @Autowired
    private AdminRepository repository;
    
    /**
     * 
     * @param request 
     */
    public void guardar(AdminRequest request) {
        
        Admin admin = new Admin(null, request.getName(), request.getEmail(), 
                request.getPassword());
        
        repository.save(admin);
    }
    
    /**
     * 
     * @return 
     */
    public List<Admin> lista() {
        return (List) repository.findAll();
    }
    
    /**
     * 
     * @param id
     * @throws Exception 
     */
    public void eliminar(Integer id) throws Exception {
        Admin entity = obtenerPorId(id);
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
    public Admin obtenerPorId(Integer id) {
        return this.repository.findById(id).orElse(null);
    }
    
    /**
     * 
     * @param request
     * @throws Exception 
     */
    public void actualizar(AdminRequest request) throws Exception {
        Admin entity = obtenerPorId(request.getIdAdmin());
        if (entity == null) {
            throw new Exception ("El elemento no existe");
        }
        
        entity.setEmail(request.getEmail());
        entity.setName(request.getName());
        entity.setPassword(request.getPassword());
        
        repository.save(entity);
    }
    
}
