package com.altran.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altran.model.Quiz;
import com.altran.service.QuizService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/quiz")
@RestController
public class QuizController {
	
	@Autowired
    private QuizService quizService;
	
	@GetMapping("/all")
	public List<Quiz> getAllQuizzes() {
		return quizService.findAll();
	}
	
	@GetMapping("/{id}")
	public Quiz  getQuizById(@PathVariable(value = "id") Long id) {
		return quizService.findByQuizId(id);
	}
	
	@GetMapping("/user/{id}")
	public List<Quiz> getQuizzesByUserId(@PathVariable(value = "id") Long id) {
		return quizService.findByUserId(id);
	}
	
	@PostMapping
	public Quiz createQuiz(@RequestBody Quiz quiz) {
		return quizService.save(quiz);
	}
	
	@DeleteMapping
	public void deleteQuizById(@PathVariable(value = "id") Long id) {
		 quizService.delete(id);
	}

}
