package com.learnSpring.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnSpring.springboot.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	// takes entity type and primary key type
	// that's it ... no need to write any other code
}
