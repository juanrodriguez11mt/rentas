package com.usa.app.g24.rentas.dto;

/**
 *
 * @author 57315
 */
public class GamaRequest {
    
    private Integer idGama;
    private String name;
    private String description;

    /**
     *
     */
    public GamaRequest() {
    }

    /**
     *
     * @param idGama
     * @param name
     * @param description
     */
    public GamaRequest(Integer idGama, String name, String description) {
        this.idGama = idGama;
        this.name = name;
        this.description = description;
    }

    /**
     *
     * @return
     */
    public Integer getIdGama() {
        return idGama;
    }

    /**
     *
     * @param idGama
     */
    public void setIdGama(Integer idGama) {
        this.idGama = idGama;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
