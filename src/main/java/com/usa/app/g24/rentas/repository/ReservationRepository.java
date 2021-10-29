package com.usa.app.g24.rentas.repository;

import com.usa.app.g24.rentas.model.Reservation;
import java.util.Date;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 57315
 */
@Repository
public interface ReservationRepository extends CrudRepository <Reservation, Integer> {
    
    /**
     *
     * @param dateOne
     * @param dateTwo
     * @return
     */
    public List<Reservation> 
        findAllByStartDateAfterAndStartDateBefore(Date dateOne, Date dateTwo);
    
    /**
     *
     * @return
     */
    @Query("SELECT count(p.status) as total, p.status "
            + "FROM Reservation p "
            + "WHERE p.status IN ('cancelled', 'completed') "
            + "GROUP BY p.status ")
    public List<Object[]> getReservationStatus();
        
}
