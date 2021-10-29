package com.usa.app.g24.rentas.dto;

/**
 *
 * @author 57315
 */
public class CarRequest {
    
    private Integer idCar;
    private String name;
    private String brand;
    private Integer year;
    private String description;
    private Gama gama;

    /**
     *
     */
    public CarRequest() {
    }

    /**
     *
     * @param idCar
     * @param name
     * @param brand
     * @param year
     * @param description
     * @param gama
     */
    public CarRequest(Integer idCar, String name, String brand, Integer year, 
            String description, Gama gama) {
        this.idCar = idCar;
        this.name = name;
        this.brand = brand;
        this.year = year;
        this.description = description;
        this.gama = gama;
    }

    /**
     *
     * @return
     */
    public Integer getIdCar() {
        return idCar;
    }

    /**
     *
     * @param idCar
     */
    public void setIdCar(Integer idCar) {
        this.idCar = idCar;
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
    public String getBrand() {
        return brand;
    }

    /**
     *
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     *
     * @return
     */
    public Integer getYear() {
        return year;
    }

    /**
     *
     * @param year
     */
    public void setYear(Integer year) {
        this.year = year;
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

    /**
     *
     * @return
     */
    public Gama getGama() {
        return gama;
    }

    /**
     *
     * @param gama
     */
    public void setGama(Gama gama) {
        this.gama = gama;
    }
    
    /**
     *
     */
    public class Gama {
        
        private Integer idGama;

        /**
         *
         */
        public Gama() {
        }

        /**
         *
         * @param idGama
         */
        public Gama(Integer idGama) {
            this.idGama = idGama;
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
        
    }
    
}
