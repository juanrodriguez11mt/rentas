package com.usa.app.g24.rentas.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author 57315
 */
@Entity
@Table(name = "Gama")
public class Gama implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idGama", scale = 11)
    private Integer idGama;
    
    @Column(name = "name", length = 45, nullable = false, unique = true)
    private String name;
    
    @Column(name = "description", length = 250, nullable = false)
    private String description;
    
    @OneToMany(mappedBy = "gama", fetch = FetchType.LAZY)
    private List<Car> cars;

    /**
     *
     */
    public Gama() {
    }

    /**
     *
     * @param idGama
     * @param name
     * @param description
     */
    public Gama(Integer idGama, String name, String description) {
        this.idGama = idGama;
        this.name = name;
        this.description = description;
    }

    /**
     *
     * @param idGama
     * @param name
     * @param description
     * @param cars
     */
    public Gama(Integer idGama, String name, String description, List<Car> cars) {
        this.idGama = idGama;
        this.name = name;
        this.description = description;
        this.cars = cars;
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

    /**
     *
     * @return
     */
    public List<Car> getCars() {
        return cars;
    }

    /**
     *
     * @param cars
     */
    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
    
}
