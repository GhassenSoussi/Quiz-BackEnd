package com.altran.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.altran.model.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {

}
