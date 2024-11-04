package com.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ems.entities.Employee;
import com.ems.exceptions.EmployeeNotFoundException;
import com.ems.services.IEmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private IEmployeeService service;
	@GetMapping("/employee")
	public List<Employee> getEmps(){
		 return service.getEmployees();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmp(@PathVariable("id") int id) {
		
		return service.getEmployee(id);
	}

}
