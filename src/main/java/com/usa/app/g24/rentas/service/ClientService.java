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
    
    /**
     * 
     * @param request
     * @throws Exception 
     */
    public void guardar(ClientRequest request) throws Exception {
        if (obtenerPorEmail(request.getEmail()) != null) {
            throw new Exception("El email del cliente ya se encuentra registrado");
        }
        
        Client client = new Client(null, request.getName(), request.getEmail(), 
                request.getPassword(), request.getAge());
        
        this.repository.save(client);
    }
    
    /**
     * 
     * @return 
     */
    public List<Client> lista() {
        return (List) repository.findAll();
    }
    
    /**
     * 
     * @param email
     * @return 
     */
    public Client obtenerPorEmail(String email) {
        return this.repository.findByEmail(email);
    }
    
    /**
     * 
     * @param id
     * @throws Exception 
     */
    public void eliminar(Integer id) throws Exception {
        Client entity = obtenerPorId(id);
        if (entity == null) {
            throw new Exception ("El elemento no existe");
        }
        
        if (!entity.getMessages().isEmpty() || 
                !entity.getReservations().isEmpty()) {
            throw new Exception ("El carro tiene mensajes o reservas relacionadas");
        }
        
        this.repository.delete(entity);
    }
    
    /**
     * 
     * @param id
     * @return 
     */
    public Client obtenerPorId(Integer id) {
        return this.repository.findById(id).orElse(null);
    }
    
    /**
     * 
     * @param request
     * @throws Exception 
     */
    public void actualizar(ClientRequest request) throws Exception {
        Client entity = obtenerPorId(request.getIdClient());
        if (entity == null) {
            throw new Exception ("El elemento no existe");
        }
        
        entity.setAge(request.getAge());
        entity.setEmail(request.getEmail());
        entity.setName(request.getName());
        entity.setPassword(request.getPassword());
        
        repository.save(entity);
    }
    
}
