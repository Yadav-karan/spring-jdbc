package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public  Address getAddress() {
		return new Address();
	}

	@Bean
	public Student getStudent() {
		return new Student(getAddress());
	}
}
