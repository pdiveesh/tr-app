package com.example.tr.app.repository;

import com.example.tr.app.model.hrQuestions;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface hrQuestionsRepository extends MongoRepository<hrQuestions, String> {
}
