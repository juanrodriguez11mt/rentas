package com.usa.app.g24.rentas.service;

import com.usa.app.g24.rentas.dto.CarRequest;
import com.usa.app.g24.rentas.model.Car;
import com.usa.app.g24.rentas.model.Gama;
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
    
    @Autowired
    private GamaService gamaService;
    
    public void guardar(CarRequest request) throws Exception {
        Gama gama = gamaService.gamaPorId(request.getGama().getIdGama());
        if (gama == null) {
            throw new Exception ("El carro debe tener una gama dispobible");
        }
        
        Car car = new Car(null, request.getName(), request.getBrand(), 
                request.getDescription(), request.getYear(), gama);
        
        carRepository.save(car);
    }
    
    public List<Car> lista() {
        return (List) carRepository.findAll();
    }
    
    public Car obtenerPorId(Integer id) {
        return this.carRepository.findById(id).orElse(null);
    }
    
}
