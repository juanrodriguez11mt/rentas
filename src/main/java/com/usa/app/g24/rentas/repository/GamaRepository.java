package com.usa.app.g24.rentas.repository;

import com.usa.app.g24.rentas.model.Gama;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 57315
 */
@Repository
public interface GamaRepository extends CrudRepository <Gama, Integer> {
    
    /**
     *
     * @param name
     * @return
     */
    Gama findByName(String name);
    
}
