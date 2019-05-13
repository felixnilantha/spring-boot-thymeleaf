package com.spring.boot.springbootthymeleaf.service;

import java.util.List;

import com.spring.boot.springbootthymeleaf.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();

	public Employee findById(int id);

	public void save(Employee employee);

	public void delete(int id);

}
