package com.mj.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;

import com.mj.example.model.AppUser;
import com.mj.example.repository.UserRepository;

public class UserService {
	@Autowired
	UserRepository userRepository;
	
	public void createUser(AppUser user) {
		userRepository.save(user);
	}
	
	
	public List<AppUser> findAllUsers() {
		List<AppUser> userList = new ArrayList<>();
		userRepository.findAll().forEach(user->userList.add(user));
		return userList;
	}
	
	public AppUser findUserById(Long id) {
		return userRepository.findById(id).get();
	}
	
	public List<AppUser> findUsersByPage(Pageable pageable) {
		List<AppUser> userList = new ArrayList<>();
		userRepository.findAll(pageable).forEach(user->userList.add(user));
		return userList;
	}
	
	public void updateUser(AppUser user) {
		this.createUser(user);
	}
	
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}
}
