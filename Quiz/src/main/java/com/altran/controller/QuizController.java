package com.altran.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
	
	//test third commit
	@Autowired
	private QuizService quizService;
	
	@PostMapping("/add")
	public Quiz create(@RequestBody Quiz quiz) {
		return quizService.save(quiz);
	}


}
