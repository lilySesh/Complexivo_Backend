package com.complexivo.Complexivo_Base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class ComplexivoBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComplexivoBaseApplication.class, args);
	}

}
