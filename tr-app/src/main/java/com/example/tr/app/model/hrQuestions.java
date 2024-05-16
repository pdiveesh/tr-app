package com.example.tr.app.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="Hrquestions")
public class hrQuestions {
    private String id;
    private String question,answer;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
