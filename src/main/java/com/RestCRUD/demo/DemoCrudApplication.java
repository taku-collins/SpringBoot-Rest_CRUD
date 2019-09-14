package com.RestCRUD.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DemoCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoCrudApplication.class, args);
	}

}
