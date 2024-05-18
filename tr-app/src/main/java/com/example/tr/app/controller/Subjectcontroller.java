package com.example.tr.app.controller;
import com.example.tr.app.model.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;

import com.example.tr.app.service.SubjectService;

@RestController
@RequestMapping("/api/Subjectdetails")
public class Subjectcontroller {
    private final SubjectService service;
    @Autowired
    public Subjectcontroller(SubjectService service) {
        this.service = service;
    }
    @GetMapping
    Collection<Subject> getDetails(@PathVariable Subject Subjectdetails ){
            return service.getDetails();
        }
        @PostMapping
        public void postDetails(@RequestBody Subject SubjectDetails){
            service.postDetails(SubjectDetails);

        }
}


