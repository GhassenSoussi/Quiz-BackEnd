package com.altran.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altran.model.Quiz;
import com.altran.repository.QuizRepository;
import com.altran.service.QuizService;

@Service
public class QuizServiceImpl implements QuizService {
	
	@Autowired
	private QuizRepository quizRepository;

	@Override
	public List<Quiz> findAll() {
		//return quizRepository.findAll();
		List<Quiz> quizzes = quizRepository.findAll();
		return quizzes;
	}

	@Override
	public Quiz findByQuizId(Long id) {
		return quizRepository.findById(id).get();
	}

	@Override
	public List<Quiz> findByUserId(Long id) {
		List<Quiz> quizzes = quizRepository.findAll();
		ArrayList<Quiz> quizzesByUser = new ArrayList<>();
		for(Quiz quiz: quizzes) {
			if (quiz.getUser().getId() == id) {
				quizzesByUser.add(quiz);
			}
		}
		return quizzesByUser;
	}

	@Override
	public Quiz save(Quiz quiz) {
		return quizRepository.save(quiz);
	}

	@Override
	public Quiz update(Long id, Quiz quiz) {
		quiz.setId(id);
		return quizRepository.save(quiz);
	}

	@Override
	public void delete(Long id) {
		quizRepository.deleteById(id);
	}

}
