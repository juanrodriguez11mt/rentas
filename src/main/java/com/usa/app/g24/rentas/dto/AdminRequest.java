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

    /**
     *
     */
    public AdminRequest() {
    }

    /**
     *
     * @param idAdmin
     * @param name
     * @param email
     * @param password
     */
    public AdminRequest(Integer idAdmin, String name,
            String email, String password) {
        this.idAdmin = idAdmin;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    /**
     *
     * @return
     */
    public Integer getIdAdmin() {
        return idAdmin;
    }

    /**
     *
     * @param idAdmin
     */
    public void setIdAdmin(Integer idAdmin) {
        this.idAdmin = idAdmin;
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
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
