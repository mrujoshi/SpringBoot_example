package com.mj.example.Controller;

import javax.persistence.*;

@Entity
public class Employee {
	@Id
	String id;
	String name;
	String designation;
	
	Employee(){
		
	}
	
	Employee(String id,String name,String designation)
	{
		this.id= id;
		this.name = name;
		this.designation = designation;
	}
	
	
	public String getId() {
		return id;
	}
	

	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + "]";
	}
	
}
