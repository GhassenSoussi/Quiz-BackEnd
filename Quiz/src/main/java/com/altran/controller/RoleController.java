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

import com.altran.model.Role;
import com.altran.service.RoleService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/role")
@RestController
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@PostMapping("/add")
	public Role create(@RequestBody Role role) {
		return roleService.save(role);
	}
	
	@GetMapping("/all")
	public List<Role> getAllRole() {
		return roleService.findAll();
	}
	
	@GetMapping("/{id}")
	public Role getRoleById(@PathVariable(value = "id") Long id) {
		return roleService.findById(id);
	}
	
	@PutMapping
	public Role updateRole(@PathVariable(value = "id") Long id , @Valid @RequestBody Role role) {
		return roleService.update(id, role);
	}
	
	@DeleteMapping
	public void deleteUser(@PathVariable(value = "id") Long id) {
		 roleService.delete(id);
	}

}
