package com.usa.app.g24.rentas.dto;

/**
 *
 * @author 57315
 */
public class ScoreRequest {
    
    private Integer idScore;
    private String messageText;
    private Integer stars;
    private Reservation reservation;

    /**
     *
     */
    public ScoreRequest() {
    }

    /**
     *
     * @param idScore
     * @param messageText
     * @param stars
     * @param reservation
     */
    public ScoreRequest(Integer idScore, String messageText, Integer stars,
            Reservation reservation) {
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
    
    /**
     *
     */
    public class Reservation {
        
        private Integer idReservation;

        /**
         *
         */
        public Reservation() {
        }

        /**
         *
         * @param idReservation
         */
        public Reservation(Integer idReservation) {
            this.idReservation = idReservation;
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
        
    }
    
}
