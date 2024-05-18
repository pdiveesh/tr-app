package com.example.tr.app.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Subjectdetails")
public class Subject {
    private String name;
    private String logo;

    // Getter and Setter for name
    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    // Getter and Setter for logo
    public String getlogo() {
        return logo;
    }

    public void setlogo(String logo) {
        this.logo = logo;
    }
}
