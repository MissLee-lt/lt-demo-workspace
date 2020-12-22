package com.example.demo.mainApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.demo")
public class SpringBootDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo1Application.class, args);
	}

}
