package com.smari.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This demo does not cover the exception handling, junit and validation. Simple demonstration for one to many unidirection relationship between the entities.
 */
@SpringBootApplication
public class JpaOnetomanyUnidirectionalApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaOnetomanyUnidirectionalApplication.class, args);
	}

}
