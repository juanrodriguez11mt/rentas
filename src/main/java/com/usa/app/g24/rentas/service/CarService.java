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
    
    /**
     * 
     * @param request
     * @throws Exception 
     */
    public void guardar(CarRequest request) throws Exception {
        Gama gama = null;
        
        if (request.getGama() != null && request.getGama().getIdGama() != null)
            gama = gamaService.obtenerPorId(request.getGama().getIdGama());
        
        //if (gama == null) {
            //throw new Exception ("El carro debe tener una gama dispobible");
        //}
        
        Car car = new Car(null, request.getName(), request.getBrand(), 
                request.getDescription(), request.getYear(), gama);
        
        carRepository.save(car);
    }
    
    /**
     * 
     * @return 
     */
    public List<Car> lista() {
        return (List) carRepository.findAll();
    }
    
    /**
     * 
     * @param id
     * @throws Exception 
     */
    public void eliminar(Integer id) throws Exception {
        Car car = obtenerPorId(id);
        if (car == null) {
            throw new Exception ("El carro no existe");
        }
        
        if (!car.getMessages().isEmpty() || 
                !car.getReservations().isEmpty()) {
            throw new Exception ("El carro tiene mensajes o reservas relacionadas");
        }
        
        // Validar que el carro exista
        this.carRepository.delete(car);
    }
    
    /**
     * 
     * @param id
     * @return 
     */
    public Car obtenerPorId(Integer id) {
        return this.carRepository.findById(id).orElse(null);
    }
    
    /**
     * 
     * @param request
     * @throws Exception 
     */
    public void actualizar(CarRequest request) throws Exception {
        Car car = obtenerPorId(request.getIdCar());
        if (car == null) {
            throw new Exception ("El carro no existe");
        }
        
        car.setName(request.getName());
        car.setBrand(request.getBrand());
        car.setYear(request.getYear());
        car.setDescription(request.getDescription());
        
        carRepository.save(car);
    }
    
}
