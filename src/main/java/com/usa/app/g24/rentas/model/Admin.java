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
@Table(name = "Admin")
public class Admin implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAdmin", scale = 11)
    private Integer idAdmin;
    
    @Column(name = "name", length = 250, nullable = false)
    private String name;
    
    @Column(name = "email", length = 45, nullable = false, unique = true)
    private String email;
    
    @Column(name = "password", length = 45, nullable = false)
    private String password;

    public Admin() {
    }

    public Admin(Integer idAdmin, String name, String email, String password) {
        this.idAdmin = idAdmin;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Integer getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(Integer idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
