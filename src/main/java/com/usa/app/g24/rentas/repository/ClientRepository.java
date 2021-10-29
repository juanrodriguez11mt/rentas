package com.usa.app.g24.rentas.repository;

import com.usa.app.g24.rentas.model.Client;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 57315
 */
@Repository
public interface ClientRepository extends CrudRepository <Client, Integer> {
    
    /**
     *
     * @param email
     * @return
     */
    Client findByEmail(String email);
    
    /**
     * 
     * @return 
     */
    @Query("SELECT DISTINCT c "
            + "FROM Client c "
            + "JOIN c.reservations r "
            + "WHERE r.status = 'completed' ")
    List<Client> getTopClients();
    
}
