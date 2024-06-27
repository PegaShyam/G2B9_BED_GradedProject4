package com.g2b9.ems.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.g2b9.ems.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer>  {
	
	List<Employee> findByFirstNameContainsAllIgnoreCase(String firstName);

	List<Employee> findAllByOrderByFirstNameAsc();	
	
}
