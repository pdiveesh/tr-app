package com.example.tr.app.controller;

import com.example.tr.app.model.Subject;
import com.example.tr.app.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@CrossOrigin(origins = {"http://localhost:8080", "http://localhost:5173"})
@RequestMapping("/api/Subjectdetails")
public class Subjectcontroller {
    private final SubjectService service;

    @Autowired
    public Subjectcontroller(SubjectService service) {
        this.service = service;
    }

    @GetMapping("/get")
    public Collection<Subject> getDetails() {
        return service.getDetails();
    }

    @PostMapping("/add")
    public void postDetails(@RequestBody Subject subject) {
        service.postDetails(subject);
    }
}
