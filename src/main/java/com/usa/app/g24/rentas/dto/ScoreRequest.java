package com.usa.app.g24.rentas.dto;

/**
 *
 * @author 57315
 */
public class ScoreRequest {
    
    private String messageText;
    private Integer stars;
    private Reservation reservation;

    public ScoreRequest() {
    }

    public ScoreRequest(String messageText, Integer stars, Reservation reservation) {
        this.messageText = messageText;
        this.stars = stars;
        this.reservation = reservation;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
    
    public class Reservation {
        
        private Integer idReservation;

        public Reservation() {
        }

        public Reservation(Integer idReservation) {
            this.idReservation = idReservation;
        }

        public Integer getIdReservation() {
            return idReservation;
        }

        public void setIdReservation(Integer idReservation) {
            this.idReservation = idReservation;
        }
        
    }
    
}
