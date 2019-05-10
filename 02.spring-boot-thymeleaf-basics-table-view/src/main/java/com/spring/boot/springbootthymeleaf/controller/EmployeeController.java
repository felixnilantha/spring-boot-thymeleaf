package com.spring.boot.springbootthymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.boot.springbootthymeleaf.model.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	
	private List<Employee> employees;
	
	@PostConstruct
	private void loadData() {
		
		Employee emp0 = new Employee(1, "Jone", "Doe", "john@springthyemelaf.com");
		Employee emp1 = new Employee(2, "Peter", "Almeda", "peter@springthyemelaf.com");
		Employee emp2 = new Employee(3, "Jerry", "Fun", "jerry@springthyemelaf.com");
		
		employees = new ArrayList<Employee>();
		employees.add(emp0);
		employees.add(emp1);
		employees.add(emp2);
	}
	
	@GetMapping("/list")
	public String getAll(Model model) {
		
		model.addAttribute("employees", employees);
		
		return "list-employees";
	}
	
	
}
