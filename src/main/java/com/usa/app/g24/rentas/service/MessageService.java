package com.usa.app.g24.rentas.service;

import com.usa.app.g24.rentas.dto.MessageRequest;
import com.usa.app.g24.rentas.model.Car;
import com.usa.app.g24.rentas.model.Client;
import com.usa.app.g24.rentas.model.Message;
import com.usa.app.g24.rentas.repository.MessageRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 57315
 */
@Service
public class MessageService {
    
    @Autowired
    private MessageRepository repository;
    
    @Autowired
    private CarService carService;
    
    @Autowired
    private ClientService clientService;
    
    public void guardar(MessageRequest request) {
        Car car = carService.obtenerPorId(request.getCar().getIdCar());
        Client client = clientService.obtenerPorId(request.getClient().getIdClient());
        
        Message message = new Message(null, request.getMessageText(), car, client);
        
        repository.save(message);
    }
    
    /**
     * 
     * @return 
     */
    public List<Message> lista() {
        return (List) repository.findAll();
    }
    
    /**
     * 
     * @param id
     * @throws Exception 
     */
    public void eliminar(Integer id) throws Exception {
        Message entity = obtenerPorId(id);
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
    public Message obtenerPorId(Integer id) {
        return this.repository.findById(id).orElse(null);
    }
    
    /**
     * 
     * @param request
     * @throws Exception 
     */
    public void actualizar(MessageRequest request) throws Exception {
        Message entity = obtenerPorId(request.getIdMessage());
        if (entity == null) {
            throw new Exception ("El elemento no existe");
        }
        
        entity.setMessageText(request.getMessageText());
        
        repository.save(entity);
    }
    
}
