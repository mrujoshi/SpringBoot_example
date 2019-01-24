package com.mj.example.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.mj.example.model.Employee;
import com.mj.example.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployee(Pageable pageable){
		return employeeRepository.findAll(pageable).getContent();
	}
	
	
	
	public Employee getEmployee(String id){
		return employeeRepository.findById(id).get();

		}
	
	public void createEmployee(Employee[] e) {
		Arrays.asList(e).forEach(i->employeeRepository.save(i));
	}
	
	public void updateEmployee(Employee employee) {
		employeeRepository.save(employee);
		
	}
	
	public void deleteEmployee(String id) {
		employeeRepository.deleteById(id);	
	}
}

