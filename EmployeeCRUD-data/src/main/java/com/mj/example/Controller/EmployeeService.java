package com.mj.example.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployee(){
		List<Employee> empoyeeList = new ArrayList<>();
		employeeRepository.findAll().forEach(empoyeeList::add);
		return empoyeeList;
	}
	
	public Employee getEmployee(String id){
		return employeeRepository.findById(id).get();

		}
	
	public void createEmployee(Employee e) {
		employeeRepository.save(e);
	}
	
	public void updateEmployee(Employee employee) {
		employeeRepository.save(employee);
		
	}
	
	public void deleteEmployee(String id) {
		employeeRepository.deleteById(id);	
	}
}

