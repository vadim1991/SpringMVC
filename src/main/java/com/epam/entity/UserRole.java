package com.epam.entity;

import javax.persistence.*;

/**
 * Created by swift-seeker-89717 on 13.05.2015.
 */
@Entity
@Table(name = "roles")
public class UserRole {

    private int id;
    private String role;

    public UserRole() {
    }

    public UserRole(String role) {
        this.role = role;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "id=" + id +
                ", role='" + role + '\'' +
                '}';
    }
}
