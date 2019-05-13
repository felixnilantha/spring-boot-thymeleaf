package com.spring.boot.springbootthymeleaf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.springbootthymeleaf.entity.Employee;

public interface EmployeRepository extends JpaRepository<Employee, Integer> {
	
	public List<Employee> findAllByOrderByLastNameAsc();
	

}
