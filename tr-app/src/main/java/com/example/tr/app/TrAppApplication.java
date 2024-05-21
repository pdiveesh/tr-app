package com.example.tr.app;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.tr.app.model.hrQuestions;
import com.example.tr.app.repository.hrQuestionsRepository;

@SpringBootApplication
public class TrAppApplication {
	private final hrQuestionsRepository repository;

	public TrAppApplication(hrQuestionsRepository repository) {
		this.repository = repository;
	}

	public static void main(String[] args) {
		SpringApplication.run(TrAppApplication.class, args);
	}
//   public List<hrQuestions> getAllHrQuestions() {
//         return repository.findAll();
//     }

}
