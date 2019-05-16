package com.altran.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altran.model.User;
import com.altran.repository.UserRepository;
import com.altran.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public User save(User user) {
		return userRepository.save(user);
	}

	@Override
	public User findById(Long id) {
		return  userRepository.findById(id).get();
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}


	@Override
	public User update(Long id, User user) {
		user.setId(id);
		return userRepository.save(user);
	}
	
	@Override
	public void delete(Long id) {
		User user = userRepository.findById(id).get();
         userRepository.delete(user);		
	}

	@Override
	public List<User> findAdminUsers() {
		List <User> users = userRepository.findAll();
		ArrayList<User> adminUser = new ArrayList<User>();
		for(User user: users) {
			if(user.getRole().getId() == 1 ) {
				adminUser.add(user);
			}
		}
		return adminUser;
	}



}
