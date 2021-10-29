package com.usa.app.g24.rentas.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author 57315
 */
@Entity
@Table(name = "Client")
public class Client implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idClient", scale = 11)
    private Integer idClient;
    
    @Column(name = "email", length = 45, nullable = false, unique = true)
    private String email;
    
    @Column(name = "password", length = 45, nullable = false)
    private String password;
    
    @Column(name = "name", length = 250, nullable = false)
    private String name;
    
    @Column(name = "age", precision = 4, scale = 3, nullable = false)
    private Integer age;
    
    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"client"})
    private List<Message> messages;
    
    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"client"})
    private List<Reservation> reservations;
    
    /**
     *
     */
    public Client() {
    }

    /**
     *
     * @param idClient
     * @param name
     * @param email
     * @param password
     * @param age
     */
    public Client(Integer idClient, String name, String email, 
            String password, Integer age) {
        this.idClient = idClient;
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    /**
     *
     * @param idClient
     * @param name
     * @param email
     * @param password
     * @param age
     * @param messages
     * @param reservations
     */
    public Client(Integer idClient, String name, String email, String password, 
            Integer age, List<Message> messages, List<Reservation> reservations) {
        this.idClient = idClient;
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
        this.messages = messages;
        this.reservations = reservations;
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

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @return
     */
    public Integer getAge() {
        return age;
    }

    /**
     *
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     *
     * @return
     */
    public List<Message> getMessages() {
        return messages;
    }

    /**
     *
     * @param messages
     */
    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    /**
     *
     * @return
     */
    public List<Reservation> getReservations() {
        return reservations;
    }

    /**
     *
     * @param reservations
     */
    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
    
    
}
