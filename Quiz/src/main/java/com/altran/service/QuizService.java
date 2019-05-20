package com.altran.service;

import java.util.List;

import com.altran.model.Quiz;

public interface QuizService {

	List<Quiz> findAll();
	
	Quiz findByQuizId(Long id);
	
	List<Quiz> findByUserId(Long id);
	
	Quiz save(Quiz quiz);
	
	Quiz update(Long id, Quiz quiz);
	
	void delete(Long id);

}
