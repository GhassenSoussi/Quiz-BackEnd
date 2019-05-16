package com.altran.service;

import java.util.List;
import com.altran.model.User;

public interface UserService {
	
	User save(User user);
	
	User findById(Long id);
	
	List<User> findAll();
	
	User update(Long id, User user);
	
	void delete(Long id);
	
	List<User> findAdminUsers();

}
