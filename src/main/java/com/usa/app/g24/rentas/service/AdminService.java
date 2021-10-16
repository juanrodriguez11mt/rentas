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
    
    public void guardar(AdminRequest request) {
        
        Admin admin = new Admin(null, request.getName(), request.getEmail(), 
                request.getPassword());
        
        repository.save(admin);
    }
    
    public List<Admin> lista() {
        return (List) repository.findAll();
    }
    
    public Admin obtenerPorId(Integer id) {
        return repository.findById(id).orElse(null);
    }
    
}
