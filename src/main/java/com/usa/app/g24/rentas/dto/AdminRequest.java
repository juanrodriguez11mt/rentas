package com.usa.app.g24.rentas.dto;

/**
 *
 * @author 57315
 */
public class AdminRequest {
    
    private Integer idAdmin;
    private String name;
    private String email;
    private String password;

    public AdminRequest() {
    }

    public AdminRequest(Integer idAdmin, String name,
            String email, String password) {
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
