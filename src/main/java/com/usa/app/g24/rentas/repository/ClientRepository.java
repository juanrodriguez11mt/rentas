package com.usa.app.g24.rentas.repository;

import com.usa.app.g24.rentas.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 57315
 */
@Repository
public interface ClientRepository extends CrudRepository <Client, Integer> {
    
    Client findByEmail(String email);
    
}
