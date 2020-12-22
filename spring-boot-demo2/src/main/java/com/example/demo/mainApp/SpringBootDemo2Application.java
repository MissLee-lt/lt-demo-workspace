package com.example.demo.mainApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan("com.example")
@EnableScheduling
public class SpringBootDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo2Application.class, args);
	}

}
