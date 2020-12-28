package com.example.mainApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
public class PushPlatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(PushPlatformApplication.class, args);
	}

}
