package com.ems.services;

import java.util.List;

import com.ems.entities.Employee;
import com.ems.exceptions.EmployeeNotFoundException;

public interface IEmployeeService {
	
	public List<Employee> getEmployees();
	public Employee getEmployee(int id) throws EmployeeNotFoundException;

}