package com.ref.jpa.example.jpa_example.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ref.jpa.example.jpa_example.model.Employee;
import com.ref.jpa.example.jpa_example.service.EmployeeService;

// Creating the REST controller
@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService empService;

	@GetMapping(path = "/", produces = "application/json")

	public List<Employee> getEmployees() {

		return empService.fetchEmployeeList();
	}

	@GetMapping(path = "/{id}", produces = "application/json")

	public Employee getEmployee(@PathVariable Integer id) {

		return empService.fetchEmployee(id);
	}

	// Create a POST method
	// to add an employee
	// to the list
	@PostMapping(path = "/", consumes = "application/json", produces = "application/json")

	public ResponseEntity<Object> addEmployee(@RequestBody Employee employee) {
		Employee emp = empService.saveEmployee(employee);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(emp.getId())
				.toUri();

		return ResponseEntity.created(location).build();
	}
	
	@PutMapping(path = "/{id}", produces = "application/json", consumes = "application/json")
	public Employee updateEmployee(@PathVariable Integer id, @RequestBody Employee employee) {
		Employee emp = empService.updateEmployee(employee, id);
		return emp;
	}
	
	@DeleteMapping(path = "/{id}") 
	public String  deleteEmployee(@PathVariable Integer id) {
		empService.deleteEmployeeById(id);
        return "Deleted Successfully";


	}
}
