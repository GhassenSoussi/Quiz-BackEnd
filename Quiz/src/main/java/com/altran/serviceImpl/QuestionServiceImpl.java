package com.altran.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altran.model.Question;
import com.altran.repository.PropositionRepository;
import com.altran.repository.QuestionRepository;
import com.altran.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private PropositionRepository propositionRepository;

	@Override
	public List<Question> findAll() {
		return questionRepository.findAll();
	}

	@Override
	public Question findById(Long id) {
		return questionRepository.findById(id).get();
 	}

	@Override
	public Question save(Question question) {
		
		return questionRepository.save(question);
	}

	@Override
	public Question update(Long id, Question question) {
		question.setId(id);
		return questionRepository.save(question);
	}

	@Override
	public void delete(Long id) {
        questionRepository.deleteById(id);		
	}

}
