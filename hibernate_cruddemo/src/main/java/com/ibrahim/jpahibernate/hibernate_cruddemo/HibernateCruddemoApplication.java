package com.ibrahim.jpahibernate.hibernate_cruddemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HibernateCruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateCruddemoApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner() {
		return runner -> {
			System.out.println("Hello Ibrahim");
		};
	}

}
