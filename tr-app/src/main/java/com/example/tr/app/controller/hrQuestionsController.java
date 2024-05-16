package com.example.tr.app.controller;

import com.example.tr.app.model.hrQuestions;
import com.example.tr.app.service.hrQuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hrQuestions")
@CrossOrigin(origins = "http://localhost:5173")  // Add this line
public class hrQuestionsController {
    private final hrQuestionsService hrQuestionService;

    @Autowired
    public hrQuestionsController(hrQuestionsService hrQuestionService) {
        this.hrQuestionService = hrQuestionService;
    }

    @PostMapping("/send")
    public ResponseEntity<hrQuestions> sendQuestions(@RequestBody hrQuestions hrQuestions) {
        hrQuestions savedQuestion = hrQuestionService.sendQuestions(hrQuestions);
        return new ResponseEntity<>(savedQuestion, HttpStatus.CREATED);
    }
}
