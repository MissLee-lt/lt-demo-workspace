package com.example.demo.mainApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.demo")
public class SpringBootSwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSwaggerApplication.class, args);
	}

}
