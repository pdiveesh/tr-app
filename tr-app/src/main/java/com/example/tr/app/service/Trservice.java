package com.example.tr.app.service;

import com.example.tr.app.model.Trquestions;
import com.example.tr.app.repository.Trrepo;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
@Service
public class Trservice {
    private final Trrepo repo;

    public Trservice(Trrepo repo) {
        this.repo = repo;
    }

    public List<Trquestions> getquestions(){
        return repo.findAll();
    };


    public void postquestions(Trquestions questions) {
        repo.save(questions);
    }
}
