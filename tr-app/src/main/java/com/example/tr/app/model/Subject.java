package com.example.tr.app.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Subjectdetails")
public class Subject {
    private String Name,logo;

    public String getLogo() {
        return logo;
    }
    public void setLogo(String Logo){
        this.logo=logo;
    }
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name=Name;
    }
}
