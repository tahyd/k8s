package com.ems.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.entities.Employee;
import com.ems.exceptions.EmployeeNotFoundException;
import com.ems.repository.EmployeeRepository;
@Service
public class EmployeeService implements IEmployeeService  {

	@Autowired
	 private EmployeeRepository repository;
	@Override
	public List<Employee> getEmployees() {
		
		return repository.findAll();
	}

	@Override
	public Employee getEmployee(int id) {
		
		
		return repository.findById(id).orElseThrow(()->new EmployeeNotFoundException("Employee not found"));
		
		/*
		 * Optional<Employee> emplOptional = repository.findById(id);
		 * 
		 * if(emplOptional.isPresent()) { return emplOptional.get(); }else { throw new
		 * EmployeeNotFoundException("Employee not found "); }
		 */
	}

}