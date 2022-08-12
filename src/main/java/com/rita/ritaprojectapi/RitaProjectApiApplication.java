package com.rita.ritaprojectapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class RitaProjectApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RitaProjectApiApplication.class, args);
	}

}
