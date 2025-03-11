package com.surfapp.SurfApp_Back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.surfapp.SurfApp_Back")
@EntityScan(basePackages = "com.surfapp.SurfApp_Back.models")

public class SurfAppBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(SurfAppBackApplication.class, args);
	}

}
