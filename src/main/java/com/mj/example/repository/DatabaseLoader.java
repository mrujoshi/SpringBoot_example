package com.mj.example.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mj.example.model.AppUser;

@Configuration
public class DatabaseLoader {
	private static final Logger log = LoggerFactory.getLogger(DatabaseLoader
			.class);

	  @Bean
	  CommandLineRunner initDatabase(UserRepository repository) {

	    return args -> {
	      log.info("Preloading " + repository.save(new AppUser("Deepak", "Admin")));
	      log.info("Preloading " + repository.save(new AppUser("Suresh", "Operator")));
	      log.info("Preloading " + repository.save(new AppUser("Sunil", "User")));
	      log.info("Preloading " + repository.save(new AppUser("Sharda", "Operator")));
	      log.info("Preloading " + repository.save(new AppUser("Ravi", "User")));
	      log.info("Preloading " + repository.save(new AppUser("Ram", "User")));
	      log.info("Preloading " + repository.save(new AppUser("Rajesh", "User")));
	      log.info("Preloading " + repository.save(new AppUser("Shweta", "User")));
	      log.info("Preloading " + repository.save(new AppUser("Purva", "User")));
	      log.info("Preloading " + repository.save(new AppUser("Nitya", "User")));
	      log.info("Preloading " + repository.save(new AppUser("Rama", "User")));
	    };
	  }
}
