package com.usa.app.g24.rentas.dto;

/**
 *
 * @author 57315
 */
public class ReportStatusResponse {
    
    private Integer completed;
    private Integer cancelled;
    
    /**
     *
     */
    public ReportStatusResponse() {
        
    }

    /**
     *
     * @param completed
     * @param cancelled
     */
    public ReportStatusResponse(Integer completed, Integer cancelled) {
        this.completed = completed;
        this.cancelled = cancelled;
    }

    /**
     *
     * @return
     */
    public Integer getCompleted() {
        return completed;
    }

    /**
     *
     * @param completed
     */
    public void setCompleted(Integer completed) {
        this.completed = completed;
    }

    /**
     *
     * @return
     */
    public Integer getCancelled() {
        return cancelled;
    }

    /**
     *
     * @param cancelled
     */
    public void setCancelled(Integer cancelled) {
        this.cancelled = cancelled;
    }
    
    
}
