package com.usa.app.g24.rentas.dto;

import java.time.LocalDate;

/**
 *
 * @author 57315
 */
public class ReservationRequest {
    
    private Integer idReservation;
    private LocalDate startDate;
    private LocalDate devolutionDate;
    private Client client;
    private Car car;
    private String status;

    /**
     *
     */
    public ReservationRequest() {
    }

    /**
     *
     * @param idReservation
     * @param startDate
     * @param devolutionDate
     * @param client
     * @param car
     * @param status
     */
    public ReservationRequest(Integer idReservation, LocalDate startDate,
            LocalDate devolutionDate, Client client, Car car, String status) {
        this.idReservation = idReservation;
        this.startDate = startDate;
        this.devolutionDate = devolutionDate;
        this.client = client;
        this.car = car;
        this.status = status;
    }

    /**
     *
     * @return
     */
    public Integer getIdReservation() {
        return idReservation;
    }

    /**
     *
     * @param idReservation
     */
    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
    }

    /**
     *
     * @return
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /**
     *
     * @param startDate
     */
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /**
     *
     * @return
     */
    public LocalDate getDevolutionDate() {
        return devolutionDate;
    }

    /**
     *
     * @param devolutionDate
     */
    public void setDevolutionDate(LocalDate devolutionDate) {
        this.devolutionDate = devolutionDate;
    }
    
    /**
     *
     * @return
     */
    public Client getClient() {
        return client;
    }

    /**
     *
     * @param client
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     *
     * @return
     */
    public Car getCar() {
        return car;
    }

    /**
     *
     * @param car
     */
    public void setCar(Car car) {
        this.car = car;
    }

    /**
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     *
     */
    public class Client {
        private Integer idClient;

        /**
         *
         */
        public Client() {
        }

        /**
         *
         * @param idClient
         */
        public Client(Integer idClient) {
            this.idClient = idClient;
        }

        /**
         *
         * @return
         */
        public Integer getIdClient() {
            return idClient;
        }

        /**
         *
         * @param idClient
         */
        public void setIdClient(Integer idClient) {
            this.idClient = idClient;
        }
        
    }
    
    /**
     *
     */
    public class Car {
        private Integer idCar;

        /**
         *
         */
        public Car() {
        }

        /**
         *
         * @param idCar
         */
        public Car(Integer idCar) {
            this.idCar = idCar;
        }

        /**
         *
         * @return
         */
        public Integer getIdCar() {
            return idCar;
        }

        /**
         *
         * @param idCar
         */
        public void setIdCar(Integer idCar) {
            this.idCar = idCar;
        }
        
    }
}
