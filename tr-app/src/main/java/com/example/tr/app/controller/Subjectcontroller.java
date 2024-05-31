package com.example.tr.app.controller;

import com.example.tr.app.model.Subject;
import com.example.tr.app.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Collection;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/subjects")
public class Subjectcontroller {

    private final SubjectService subjectService;

    public Subjectcontroller(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @PostMapping("/add")
    public String createSubject(@RequestParam String subjectName, @RequestParam("subjectIcon") MultipartFile subjectIcon) {
        return subjectService.createSubject(subjectName, subjectIcon);
    }

    @GetMapping("/getsubjects")
    public List<Subject> getAllSubjects() {
        return subjectService.getAllSubjects();
    }
}
