package com.altran.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.altran.model.Quiz;
import com.altran.repository.QuizRepository;
import com.altran.service.QuizService;

public class QuizServiceImpl implements QuizService {
	@Autowired
	private QuizRepository quizRepository;

	@Override
	public List<Quiz> findAll() {
		return quizRepository.findAll();
	}

	@Override
	public Quiz findByQuizId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Quiz> findByUserId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Quiz save(Quiz quiz) {
		return quizRepository.save(quiz);
	}

	@Override
	public Quiz update(Long id, Quiz quiz) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		return ;
	}

}
