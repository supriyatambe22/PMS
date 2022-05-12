package com.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class PlacemnetManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlacemnetManagementSystemApplication.class, args);
	}

}
