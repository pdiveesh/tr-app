package com.example.tr.app.repository;

import com.example.tr.app.model.Trquestions;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Trrepo extends MongoRepository<Trquestions,Long> {
}
