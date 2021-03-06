package com.push.mainApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.push")
public class PushPlatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(PushPlatformApplication.class, args);
	}

}
