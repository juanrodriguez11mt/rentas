package com.usa.app.g24.rentas.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author 57315
 */
@Entity
@Table(name = "Score")
public class Score implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idScore", scale = 11)
    private Integer idScore;
    
    @Column(name = "message_text", length = 250, nullable = false)
    private String messageText;
    
    @Column(name = "stars", precision = 1, scale = 1, nullable = false)
    private Integer stars;
    
    @OneToOne(orphanRemoval = false)
    @JoinColumn(name = "idReservation", updatable = false, nullable = false)
    @JsonIgnoreProperties("score")
    private Reservation reservation;

    /**
     *
     */
    public Score() {
    }

    /**
     *
     * @param idScore
     * @param messageText
     * @param stars
     * @param reservation
     */
    public Score(Integer idScore, String messageText, Integer stars, Reservation reservation) {
        this.idScore = idScore;
        this.messageText = messageText;
        this.stars = stars;
        this.reservation = reservation;
    }

    /**
     *
     * @return
     */
    public Integer getIdScore() {
        return idScore;
    }

    /**
     *
     * @param idScore
     */
    public void setIdScore(Integer idScore) {
        this.idScore = idScore;
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
    public Integer getStars() {
        return stars;
    }

    /**
     *
     * @param stars
     */
    public void setStars(Integer stars) {
        this.stars = stars;
    }

    /**
     *
     * @return
     */
    public Reservation getReservation() {
        return reservation;
    }

    /**
     *
     * @param reservation
     */
    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
