package com.ems.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ems.entities.Employee;
import com.ems.exceptions.EmployeeNotFoundException;
import com.ems.services.IEmployeeService;

@RestController
public class EmployeeController {
	private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);
	@Autowired
	private IEmployeeService service;
	@GetMapping("/employee")
	public List<Employee> getEmps() throws InterruptedException {

		Thread.sleep(1000);
		log.info(" Thread name {} "+Thread.currentThread());
		return service.getEmployees();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmp(@PathVariable("id") int id) {
		
		return service.getEmployee(id);
	}

}
