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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author 57315
 */
@Entity
@Table(name = "Car")
public class Car implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCar", scale = 11)
    private Integer idCar;
    
    @Column(name = "name", length = 45, nullable = false)
    private String name;
    
    @Column(name = "brand", length = 45, nullable = false)
    private String brand;
    
    @Column(name = "description", length = 250, nullable = false)
    private String description;
    
    @Column(name = "year", precision = 4, nullable = false)
    private Integer year;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idGama", nullable = false)
    @JsonIgnoreProperties("cars")
    private Gama gama;
    
    @OneToMany(mappedBy = "car", fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"car", "client"})
    private List<Message> messages;
    
    @OneToMany(mappedBy = "car", fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"car", "messages"})
    private List<Reservation> reservations;

    public Car() {
    }

    public Car(Integer idCar, String name, String brand, String description, Integer year, Gama gama) {
        this.idCar = idCar;
        this.name = name;
        this.brand = brand;
        this.description = description;
        this.year = year;
        this.gama = gama;
    }

    public Integer getIdCar() {
        return idCar;
    }

    public void setIdCar(Integer idCar) {
        this.idCar = idCar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Gama getGama() {
        return gama;
    }

    public void setGama(Gama gama) {
        this.gama = gama;
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
