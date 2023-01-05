package com.ref.jpa.example.jpa_example.service;
//Java Program to Demonstrate EmployeeService File

//Importing required classes
import java.util.List;

import com.ref.jpa.example.jpa_example.model.Employee;

//Interface
public interface EmployeeService {

	// Save operation
	Employee saveEmployee(Employee employee);

	// Read operation
	List<Employee> fetchEmployeeList();

	// Update operation
	Employee updateEmployee(Employee employee, Integer employeeId);

	// Delete operation
	void deleteEmployeeById(Integer employeeId);

	Employee fetchEmployee(Integer id);

}
