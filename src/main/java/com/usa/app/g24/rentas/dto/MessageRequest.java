package com.usa.app.g24.rentas.dto;

/**
 *
 * @author 57315
 */
public class MessageRequest {
    
    private Integer idMessage;
    private String messageText;
    private Client client;
    private Car car;

    /**
     *
     */
    public MessageRequest() {
    }

    /**
     *
     * @param idMessage
     * @param messageText
     * @param client
     * @param car
     */
    public MessageRequest(Integer idMessage, String messageText,
            Client client, Car car) {
        this.idMessage = idMessage;
        this.messageText = messageText;
        this.client = client;
        this.car = car;
    }

    /**
     *
     * @return
     */
    public String getMessageText() {
        return messageText;
    }

    /**
     *
     * @param messageText
     */
    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    /**
     *
     * @return
     */
    public Integer getIdMessage() {
        return idMessage;
    }

    /**
     *
     * @param idMessage
     */
    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
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
