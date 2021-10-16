package com.usa.app.g24.rentas.service;

import com.usa.app.g24.rentas.model.Car;
import com.usa.app.g24.rentas.repository.CarRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 57315
 */
@Service
public class CarService {
    
    @Autowired
    private CarRepository carRepository;
    
    public void guardar() {
        
    }
    
    public List<Car> lista() {
        return (List) carRepository.findAll();
    }
    
}
