package com.example.tr.app.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "regusers")

public class LoginRequest {
    private String email;
    private String password;

    // Getters, Setters, Constructors

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