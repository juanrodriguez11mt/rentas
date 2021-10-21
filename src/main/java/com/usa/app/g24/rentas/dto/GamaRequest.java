package com.usa.app.g24.rentas.dto;

/**
 *
 * @author 57315
 */
public class GamaRequest {
    
    private Integer idGama;
    private String name;
    private String description;

    public GamaRequest() {
    }

    public GamaRequest(Integer idGama, String name, String description) {
        this.idGama = idGama;
        this.name = name;
        this.description = description;
    }

    public Integer getIdGama() {
        return idGama;
    }

    public void setIdGama(Integer idGama) {
        this.idGama = idGama;
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
