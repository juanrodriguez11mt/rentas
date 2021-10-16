package com.usa.app.g24.rentas.dto;

/**
 *
 * @author 57315
 */
public class MessageRequest {
    
    private String messageText;
    private Client client;
    private Car car;

    public MessageRequest() {
    }

    public MessageRequest(String messageText, Client client, Car car) {
        this.messageText = messageText;
        this.client = client;
        this.car = car;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
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
