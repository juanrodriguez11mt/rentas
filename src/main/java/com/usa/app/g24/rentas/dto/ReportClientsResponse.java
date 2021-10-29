package com.usa.app.g24.rentas.dto;

import com.usa.app.g24.rentas.model.Client;

/**
 *
 * @author 57315
 */
public class ReportClientsResponse {
    
    private Integer total;
    private Client client;

    /**
     *
     */
    public ReportClientsResponse() {
    }

    /**
     *
     * @param total
     * @param client
     */
    public ReportClientsResponse(Integer total, Client client) {
        this.total = total;
        this.client = client;
    }

    /**
     *
     * @return
     */
    public Integer getTotal() {
        return total;
    }

    /**
     *
     * @param total
     */
    public void setTotal(Integer total) {
        this.total = total;
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
