package com.example.tr.app.controller;

import com.example.tr.app.model.Trquestions;
import com.example.tr.app.service.Trservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
@RestController
@CrossOrigin(origins = {"http://localhost:8080", "http://localhost:5173"})
@RequestMapping("/trquestions")
public class Trcontroller {
    private final Trservice Service;
    @Autowired
    public Trcontroller(Trservice service) {
        Service = service;
    }
    @GetMapping("/get")
    public Collection<Trquestions> getquestions(){
        return Service.getquestions();
    };
    @PostMapping("/post")
    public void postquestions(@RequestBody Trquestions questions){
        Service.postquestions(questions);

    };
}
