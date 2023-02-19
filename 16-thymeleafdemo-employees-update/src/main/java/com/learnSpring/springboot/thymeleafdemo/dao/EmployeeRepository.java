package com.learnSpring.springboot.thymeleafdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnSpring.springboot.thymeleafdemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	// takes entity type and primary key type
	// that's it ... no need to write any other code
	
	// add a method to sort by last name
	// spring data JPA will understand the name of the method
	// and create a query to get you what you want
	public List<Employee> findAllByOrderByLastNameAsc();
}
