package com.ref.jpa.example.service.jpa_example.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ref.jpa.example.jpa_example.model.Employee;
import com.ref.jpa.example.jpa_example.model.repo.EmployeeRepo;
import com.ref.jpa.example.jpa_example.service.EmployeeService;



@Service
public class EmployeeServiceImpl  implements EmployeeService{

	@Autowired
	private EmployeeRepo empRepo;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		return empRepo.save(employee);
	}

	@Override
	public List<Employee> fetchEmployeeList() {
		return empRepo.findAll();
	}

	@Override
	public Employee updateEmployee(Employee employee, Integer employeeId) {
		Employee oldEmp = empRepo.getById(employeeId);
		oldEmp.setFirstName(employee.getFirstName());
		oldEmp.setLastName(employee.getLastName());
		oldEmp.setEmail(employee.getEmail());
		oldEmp = empRepo.save(oldEmp);
		return oldEmp;
	}

	@Override
	public void deleteEmployeeById(Integer employeeId) {
		empRepo.deleteById(employeeId);	
	}

	@Override
	public Employee fetchEmployee(Integer id) {
		List<Employee> empList = empRepo.findAll();
		Optional<Employee> emp = empList.stream().filter(e -> e.getId() == id).findFirst();
		return emp.get();
	}

}
