package com.usa.app.g24.rentas.dto;

/**
 *
 * @author 57315
 */
public class GamaRequest {
    
    private String name;
    private String description;

    public GamaRequest() {
    }

    public GamaRequest(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
