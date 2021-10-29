package com.usa.app.g24.rentas.repository;

import com.usa.app.g24.rentas.model.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 57315
 */
@Repository
public interface AdminRepository extends CrudRepository <Admin, Integer> {
    
    /**
     *
     * @param email
     * @return
     */
    Admin findByEmail(String email);
    
}
