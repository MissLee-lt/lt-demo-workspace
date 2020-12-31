package com.pushPlatform.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.pushPlatform")
public class SpringBootPushPlatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPushPlatformApplication.class, args);
	}

}
