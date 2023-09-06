package com.citylarry.workshop3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableReactiveMongoRepositories
public class Workshop3Application {

	public static void main(String[] args) {
		SpringApplication.run(Workshop3Application.class, args);
	}
}
