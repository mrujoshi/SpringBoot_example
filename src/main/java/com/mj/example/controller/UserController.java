package com.mj.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mj.example.model.AppUser;
import com.mj.example.repository.UserRepository;

import exceptions.UserNotFoundException;

@RestController
public class UserController {
	@Autowired
	UserRepository repository;

	@PostMapping("/user")
	public AppUser createUser(@RequestBody AppUser user) {
		return repository.save(user);
	}

	@GetMapping("/user/{id}")
	public AppUser getUser(@PathVariable Long id) {
		return repository.findById(id)
				.orElseThrow(() -> new UserNotFoundException(id));
	}

	@GetMapping("/users")
	public Iterable<AppUser> getAllUsers(){return repository.findAll(Sort.by("role"));}
	
	@GetMapping("/user")
	public Page<AppUser> getUserByPage(@RequestParam int page, @RequestParam int size){
		Pageable pageable = PageRequest.of(page,size,Sort.by("name").descending());
		return repository.findAll(pageable);
	}

	@PutMapping("/user/{id}")
	public AppUser updateUser(@RequestBody AppUser newUser, @PathVariable Long id) {
		return repository.findById(id)
				.map(user -> {
					user.setName(newUser.getName());
					user.setRole(newUser.getRole());
					return repository.save(user);
				})
				.orElseGet(() -> {
					newUser.setId(id);
					return repository.save(newUser);
				});
	}

	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
