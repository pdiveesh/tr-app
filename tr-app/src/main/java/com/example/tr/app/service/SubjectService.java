package com.example.tr.app.service;

import com.example.tr.app.model.Subject;
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
        return repo.findAll();
    }

    public void postDetails(Subject subject) {
        repo.save(subject);
    }
}
