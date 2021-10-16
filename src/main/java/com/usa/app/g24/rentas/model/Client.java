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
    
    public Client() {
    }

    public Client(Integer idClient, String name, String email, 
            String password, Integer age) {
        this.idClient = idClient;
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
    }

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

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
    
    
}
