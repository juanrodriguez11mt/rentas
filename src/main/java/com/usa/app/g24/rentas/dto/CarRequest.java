package com.usa.app.g24.rentas.dto;

/**
 *
 * @author 57315
 */
public class CarRequest {
    
    private String name;
    private String brand;
    private Integer year;
    private String description;
    private Gama gama;

    public CarRequest() {
    }

    public CarRequest(String name, String brand, Integer year, String description, Gama gama) {
        this.name = name;
        this.brand = brand;
        this.year = year;
        this.description = description;
        this.gama = gama;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Gama getGama() {
        return gama;
    }

    public void setGama(Gama gama) {
        this.gama = gama;
    }
    
    public class Gama {
        
        private Integer idGama;

        public Gama() {
        }

        public Gama(Integer idGama) {
            this.idGama = idGama;
        }

        public Integer getIdGama() {
            return idGama;
        }

        public void setIdGama(Integer idGama) {
            this.idGama = idGama;
        }
        
    }
    
}
