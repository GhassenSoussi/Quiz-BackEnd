package com.altran.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.altran.model.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long> {

}
