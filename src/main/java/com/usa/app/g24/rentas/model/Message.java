package com.usa.app.g24.rentas.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author 57315
 */
@Entity
@Table(name = "Message")
public class Message implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMessage", scale = 11)
    private Integer idMessage;
    
    @Column(name = "message_text", length = 250, nullable = false)
    private String messageText;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idCar", nullable = false)
    @JsonIgnoreProperties({"messages", "reservations"})
    private Car car;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idClient", nullable = false)
    @JsonIgnoreProperties({"messages", "reservations"})
    private Client client;
    
    /**
     *
     */
    public Message() {
        
    }

    /**
     *
     * @param idMessage
     * @param messageText
     * @param car
     * @param client
     */
    public Message(Integer idMessage, String messageText, Car car, Client client) {
        this.idMessage = idMessage;
        this.messageText = messageText;
        this.car = car;
        this.client = client;
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
    
}
