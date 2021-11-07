package com.usa.app.g24.rentas.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author 57315
 */
@Entity
@Table(name = "Reservation")
public class Reservation implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idReservation", scale = 11)
    private Integer idReservation;
    
    @Column(name = "startDate", nullable = false)
    private Date startDate;
    
    @Column(name = "devolutionDate", nullable = false)
    private Date devolutionDate;
    
    @JoinColumn(name = "status", nullable = false)
    private String status;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idCar", nullable = false)
    @JsonIgnoreProperties({"reservations"})
    private Car car;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idClient", nullable = false)
    @JsonIgnoreProperties({"messages", "reservations"})
    private Client client;
    
    @OneToOne(mappedBy = "reservation", cascade = CascadeType.ALL, orphanRemoval = true)
    private Score score;

    /**
     *
     */
    public Reservation() {
    }

    /**
     *
     * @param idReservation
     * @param startDate
     * @param devolutionDate
     * @param status
     * @param car
     * @param client
     * @param score
     */
    public Reservation(Integer idReservation, Date startDate, Date devolutionDate,
            String status, Car car, Client client, Score score) {
        this.idReservation = idReservation;
        this.startDate = startDate;
        this.devolutionDate = devolutionDate;
        this.status = status;
        this.car = car;
        this.client = client;
        this.score = score;
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
    public Date getStartDate() {
        return startDate;
    }

    /**
     *
     * @param startDate
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     *
     * @return
     */
    public Date getDevolutionDate() {
        return devolutionDate;
    }

    /**
     *
     * @param devolutionDate
     */
    public void setDevolutionDate(Date devolutionDate) {
        this.devolutionDate = devolutionDate;
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

    /**
     *
     * @return
     */
    public Score getScore() {
        return score;
    }

    /**
     *
     * @param score
     */
    public void setScore(Score score) {
        this.score = score;
    }
    
}
