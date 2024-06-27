package com.g2b9.ems.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.g2b9.ems.entity.User;
import com.g2b9.ems.dao.UserRepository;
import com.g2b9.ems.service.UserService;

import jakarta.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;	
	@Autowired
	BCryptPasswordEncoder bcryptEncoder;

	@Override
	@Transactional
	public List<User> findAll() {
		List<User> users = userRepository.findAll();
		return users;
	}

	@Override
	@Transactional
	public Optional<User> findByUserName(String userName) {
		return Optional.ofNullable(userRepository.getUserByUsername(userName));
	}

	@Override
	@Transactional
	public User saveUser(User user) {
		user.setPassword(bcryptEncoder.encode(user.getPassword()));
		return userRepository.save(user);
	}
}
