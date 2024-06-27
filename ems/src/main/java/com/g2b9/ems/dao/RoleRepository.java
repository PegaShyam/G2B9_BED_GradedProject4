package com.g2b9.ems.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.g2b9.ems.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>  {
	@Query("SELECT u FROM Role u WHERE u.name = ?1")
	public Role getUserByRolename(String name);
}
