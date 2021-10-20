package org.launchcode.spaday.models;

import javax.validation.constraints.Email;
import java.util.Date;

public class User {
    private Integer id;
    private static Integer nextId = 1;
    private String username;
    private String email;
    private String password;
    private Date dateJoined;

    public User() {
        this.id = nextId;
        nextId++;
    }

    public User(String username, String email, String password, Date dateJoined) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
        this.dateJoined = new Date();
    }

    public Date getDateJoined() {
        return dateJoined;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
