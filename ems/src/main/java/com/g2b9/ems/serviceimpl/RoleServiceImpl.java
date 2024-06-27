package com.g2b9.ems.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.g2b9.ems.entity.Role;
import com.g2b9.ems.dao.RoleRepository;
import com.g2b9.ems.service.RoleService;

import jakarta.transaction.Transactional;

@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	RoleRepository roleRepository;
	@Autowired
	BCryptPasswordEncoder bcryptEncoder;


	@Override
	@Transactional
	public List<Role> findAll() {
		List<Role> roles = roleRepository.findAll();
		return roles;
	}

	@Override
	public Optional<Role> findByName(String name) {
		return Optional.ofNullable(roleRepository.getUserByRolename(name));
	}
	

	@Override
	public Role saveRole(Role role) {
		return roleRepository.save(role);
	}

}
