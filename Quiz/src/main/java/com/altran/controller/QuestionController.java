package com.altran.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altran.model.Question;
import com.altran.service.QuestionService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/question")
@RestController
public class QuestionController {
	
	@Autowired
	private QuestionService questionService;
	
	@GetMapping("/all")
	public List<Question> getAllQuestions() {
		return questionService.findAll();
	} 
	
	@PostMapping
	public Question createQuestion(@RequestBody Question question) {
		return questionService.save(question);
	}
}
