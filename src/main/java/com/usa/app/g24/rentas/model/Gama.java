package com.usa.app.g24.rentas.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author 57315
 */
@Entity
@Table("Gama")
public class Gama implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idGama", length = 11)
    private Integer idGama;
    
    @Column(name = "name", length = 45)
    private String name;
    
    @Column(name = "description", length = 250)
    private String description;

    public Gama() {
    }

    public Gama(Integer idGama, String name, String description) {
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
