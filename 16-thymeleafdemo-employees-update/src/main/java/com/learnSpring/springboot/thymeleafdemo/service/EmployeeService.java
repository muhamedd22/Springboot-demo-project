package com.learnSpring.springboot.thymeleafdemo.service;

import java.util.List;

import com.learnSpring.springboot.thymeleafdemo.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee thEmployee);
	
	public void deleteById(int theId);
}
