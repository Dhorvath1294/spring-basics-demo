package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

// The class annotated with @SpringBootApplication houses the main method of our application. It also serves as a @Configuration class

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext appContext = SpringApplication.run(DemoApplication.class, args);
		appContext.getEnvironment();
	}

}
