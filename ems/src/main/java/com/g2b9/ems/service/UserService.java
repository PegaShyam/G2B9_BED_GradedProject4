package com.g2b9.ems.service;

import java.util.List;
import java.util.Optional;

import com.g2b9.ems.entity.User;

public interface UserService {
	public List<User> findAll();
	public User saveUser(User user);
	public Optional<User> findByUserName(String userName);
}
