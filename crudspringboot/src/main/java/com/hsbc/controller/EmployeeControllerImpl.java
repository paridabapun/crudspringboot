package com.hsbc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.model.Employee;

@RestController
public class EmployeeControllerImpl implements EmployeeController {

	@GetMapping("/employees")
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setEmployee_Id(1);
		employee.setEmployee_name("Bhagbata Parida");

		Employee employee2 = new Employee();
		employee2.setEmployee_Id(2);
		employee2.setEmployee_name("Akshay Nagadeve");
		List<Employee> list = new ArrayList<Employee>();

		list.add(employee);
		list.add(employee2);

		return list;
	}

	@Override
	public Employee getEmployeeByID(int employee_Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(int employee_Id) {
		// TODO Auto-generated method stub

	}

	@Override
	public ResponseEntity<Object> createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Object> updaEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

}
