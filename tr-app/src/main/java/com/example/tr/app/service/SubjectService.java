package com.example.tr.app.service;

import com.example.tr.app.model.Subject;
import com.example.tr.app.model.hrQuestions;
import com.example.tr.app.repository.SubjectRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {
    private final SubjectRepo repo;

    public SubjectService(SubjectRepo repo) {
        this.repo = repo;
    }
    public List<Subject> getDetails() {
        List<Subject> details = repo.findAll();
        return details;
    }

    public void postDetails(Subject SubjectDetails){
        repo.insert(SubjectDetails);

    }
}
