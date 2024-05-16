package com.example.tr.app.service;

import com.example.tr.app.model.hrQuestions;
import com.example.tr.app.repository.hrQuestionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class hrQuestionsService {
private final hrQuestionsRepository questionsRepository;

@Autowired
public hrQuestionsService(hrQuestionsRepository questionsRepository) {
    this.questionsRepository = questionsRepository;
}
public hrQuestions sendQuestions(hrQuestions hrQuestions) {
    return questionsRepository.save(hrQuestions);

}
}
