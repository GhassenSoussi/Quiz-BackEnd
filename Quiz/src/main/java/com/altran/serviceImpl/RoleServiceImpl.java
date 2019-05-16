package com.altran.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altran.model.Role;
import com.altran.repository.RoleRepository;
import com.altran.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleRepository roleRepository;

	@Override
	public Role save(Role role) {
		return roleRepository.save(role);
	}
	
	@Override
	public Role findById(Long id) {
		return roleRepository.findById(id).get();
	}

	@Override
	public List<Role> findAll() {
		return roleRepository.findAll();
	}

	@Override
	public void delete(Long id) {
		Role role = roleRepository.findById(id).get();
		roleRepository.delete(role);
	}

	@Override
	public Role update(Long id, Role role) {
		role.setId(id);
		return roleRepository.save(role);
	}

}
