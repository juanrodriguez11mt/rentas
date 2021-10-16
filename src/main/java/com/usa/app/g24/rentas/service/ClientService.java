package com.usa.app.g24.rentas.service;

import com.usa.app.g24.rentas.dto.ClientRequest;
import com.usa.app.g24.rentas.model.Client;
import com.usa.app.g24.rentas.repository.ClientRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 57315
 */
@Service
public class ClientService {
    
    @Autowired
    private ClientRepository repository;
    
    public void guardar(ClientRequest request) throws Exception {
        if (obtenerPorEmail(request.getEmail()) != null) {
            throw new Exception("El email del cliente ya se encuentra registrado");
        }
        
        Client client = new Client(null, request.getName(), request.getEmail(), 
                request.getPassword(), request.getAge());
        
        this.repository.save(client);
    }
    
    public List<Client> lista() {
        return (List) repository.findAll();
    }
    
    public Client obtenerPorEmail(String email) {
        return this.repository.findByEmail(email);
    }
    
    public Client obtenerPorId(Integer id) {
        return this.repository.findById(id).orElse(null);
    }
    
}
