package com.altran.service;

import java.util.List;

import com.altran.model.Question;

public interface QuestionService {
	
	List<Question> findAll();
	
	Question findById(Long id);
	
	Question save(Question question);
	
	Question update(Long id,Question question);
	
	void delete(Long id);
	
	

}
