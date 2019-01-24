package com.mj.example.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.mj.example.model.Employee;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, String> {
	
}
