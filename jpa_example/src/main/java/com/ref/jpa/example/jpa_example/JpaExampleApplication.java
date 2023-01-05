package com.ref.jpa.example.jpa_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
scanBasePackages = { "com.ref" })
public class JpaExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaExampleApplication.class, args);
	}

}
