package com.example.tr.app.service;

import com.example.tr.app.model.Subject;
import com.example.tr.app.repository.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class SubjectService {

    private final SubjectRepo subjectRepo;

    @Autowired
    public SubjectService(SubjectRepo subjectRepo) {
        this.subjectRepo = subjectRepo;
    }

    public String createSubject(String subjectName, MultipartFile subjectIcon) {
        try {
            Subject subject = new Subject();
            subject.setSubjectName(subjectName);
            subject.setSubjectIcon(subjectIcon.getBytes());
            subjectRepo.save(subject);
            return "Subject created successfully";
        } catch (IOException e) {
            e.printStackTrace();
            return "Error creating subject";
        }
    }

    public List<Subject> getAllSubjects() {
        return subjectRepo.findAll();
    }
}
