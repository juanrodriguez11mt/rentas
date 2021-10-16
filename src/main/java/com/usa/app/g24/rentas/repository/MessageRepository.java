package com.usa.app.g24.rentas.repository;

import com.usa.app.g24.rentas.model.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 57315
 */
@Repository
public interface MessageRepository extends CrudRepository <Message, Integer> {
    
}
