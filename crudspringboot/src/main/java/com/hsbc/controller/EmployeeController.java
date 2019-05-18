package com.hsbc.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.hsbc.model.Employee;

public interface EmployeeController {

	public List<Employee> getAllEmployees();
	public Employee getEmployeeByID(int employee_Id);
	public void deleteEmployee(int employee_Id);
	public ResponseEntity<Object> createEmployee(Employee employee);
	public ResponseEntity<Object> updaEmployee(Employee  employee);
	
	
}
