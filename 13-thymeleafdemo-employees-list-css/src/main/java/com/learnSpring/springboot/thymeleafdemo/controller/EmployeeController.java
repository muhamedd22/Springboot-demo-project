package com.learnSpring.springboot.thymeleafdemo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learnSpring.springboot.thymeleafdemo.model.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	// load employee data
	private List<Employee> employees;
	
	// run one time at startup
	@PostConstruct
	private void loadData() {
		Employee emp1 = new Employee(1, "mohamed", "ashraf" , "mo@gmail.com");
		Employee emp2 = new Employee(1, "ahmed", "mostafa" , "ah@gmail.com");
		Employee emp3 = new Employee(1, "momen", "muns" , "muns@gmail.com");
		
		employees = new ArrayList<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
	}
	
	
	// add mapping for "/list"
	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		// add to the spring model
		theModel.addAttribute("employees", employees);
		
		return "list-employees";
	}
}
