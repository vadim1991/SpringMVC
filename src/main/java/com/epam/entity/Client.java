package com.epam.entity;

import com.epam.validator.annotation.*;

import java.io.Serializable;

/**
 * Created by swift-seeker-89717 on 14.05.2015.
 */
public class Client implements Serializable {

    private int id;
    @NotEmpty
    private String login;
    @Length(min = 4, max = 15)
    private String password;
    @Phone
    private String phone;
    @NotNull
    private boolean isEnabled;
    @Email
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", isEnabled=" + isEnabled +
                ", email='" + email + '\'' +
                '}';
    }
}
