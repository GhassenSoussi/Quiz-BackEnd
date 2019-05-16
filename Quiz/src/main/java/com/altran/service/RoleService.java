package com.altran.service;

import java.util.List;

import com.altran.model.Role;

public interface RoleService {
	
	Role save(Role role);
	
	Role findById(Long id);
	
	List<Role> findAll();
	
	Role update(Long id, Role role);
	
	void  delete(Long id);
}
