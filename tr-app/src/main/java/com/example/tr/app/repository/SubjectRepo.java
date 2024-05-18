package com.example.tr.app.repository;

import com.example.tr.app.model.Subject;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SubjectRepo extends MongoRepository<Subject, Long> {
}
