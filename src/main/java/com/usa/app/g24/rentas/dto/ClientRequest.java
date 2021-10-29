package com.usa.app.g24.rentas.dto;

/**
 *
 * @author 57315
 */
public class ClientRequest {
    
    private Integer idClient;
    private String name;
    private String email;
    private String password;
    private Integer age;

    /**
     *
     */
    public ClientRequest() {
    }

    /**
     *
     * @param idClient
     * @param name
     * @param email
     * @param password
     * @param age
     */
    public ClientRequest(Integer idClient, String name, String email,
            String password, Integer age) {
        this.idClient = idClient;
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    /**
     *
     * @return
     */
    public Integer getIdClient() {
        return idClient;
    }

    /**
     *
     * @param idClient
     */
    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
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

    /**
     *
     * @return
     */
    public Integer getAge() {
        return age;
    }

    /**
     *
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }
    
}
