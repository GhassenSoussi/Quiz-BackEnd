package com.altran.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altran.model.User;
import com.altran.service.UserService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/user")
@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/add")
	public User create(@RequestBody User user) {
		return userService.save(user);
	}
	
	@GetMapping("/all")
	public List<User> getAllUsers() {
		return userService.findAll();
	}
	
	@GetMapping("/{id}") 
	public User findUserById(@PathVariable(value = "id") Long id) {
		return userService.findById(id);
	}

	@PutMapping("/update/{id}")
	public User updateUser(@PathVariable(value = "id") Long id, @Valid @RequestBody User user) {
		return userService.update(id, user);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable(value="id") Long id) {
		 userService.delete(id);
	}
	
	@GetMapping("/admin/all") 
		public List<User> getAdminUsers() {
			return userService.findAdminUsers();
		}
	
}

	

