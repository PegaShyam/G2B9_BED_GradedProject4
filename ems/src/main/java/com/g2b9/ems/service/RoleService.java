package com.g2b9.ems.service;

import java.util.List;
import java.util.Optional;

import com.g2b9.ems.entity.Role;

public interface RoleService {
	public List<Role> findAll();
	public Role saveRole(Role role);
	public Optional<Role> findByName(String name);

}
