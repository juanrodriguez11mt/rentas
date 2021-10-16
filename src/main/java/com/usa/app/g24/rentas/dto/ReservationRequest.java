package com.usa.app.g24.rentas.dto;

import java.time.LocalDate;

/**
 *
 * @author 57315
 */
public class ReservationRequest {
    
    private LocalDate startDate;
    private LocalDate devolutionDate;
    private Client client;
    private Car car;    

    public ReservationRequest() {
    }

    public ReservationRequest(LocalDate startDate, LocalDate devolutionDate, 
            Client client, Car car) {
        this.startDate = startDate;
        this.devolutionDate = devolutionDate;
        this.client = client;
        this.car = car;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getDevolutionDate() {
        return devolutionDate;
    }

    public void setDevolutionDate(LocalDate devolutionDate) {
        this.devolutionDate = devolutionDate;
    }
    
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
    
    public class Client {
        private Integer idClient;

        public Client() {
        }

        public Client(Integer idClient) {
            this.idClient = idClient;
        }

        public Integer getIdClient() {
            return idClient;
        }

        public void setIdClient(Integer idClient) {
            this.idClient = idClient;
        }
        
    }
    
    public class Car {
        private Integer idCar;

        public Car() {
        }

        public Car(Integer idCar) {
            this.idCar = idCar;
        }

        public Integer getIdCar() {
            return idCar;
        }

        public void setIdCar(Integer idCar) {
            this.idCar = idCar;
        }
        
    }
}
