package com.mj.example.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.mj.example.model.AppUser;

public interface UserRepository extends PagingAndSortingRepository<AppUser,Long> {
	
}

