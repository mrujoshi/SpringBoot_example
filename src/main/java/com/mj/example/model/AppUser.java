package com.mj.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class AppUser {
@Id
@GeneratedValue
Long Id;
@NotNull
@Size(min=3,max=50,message="Name should be between 3 to 50 characters")
String name;
String role;



public AppUser() {
	super();
}

public AppUser(@NotNull @Size(min = 3, max = 50, message = "Name should be between 3 to 50 characters") String name,
		String role) {
	super();
	this.name = name;
	this.role = role;
}

public Long getId() {
	return Id;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}

public void setId(Long id) {
	this.Id = id;
}


}
