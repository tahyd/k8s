package com.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
