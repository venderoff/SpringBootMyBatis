package com.usman.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.usman.controllers", "com.usman.dao	","com.usman.app"})
public class SprinBootWithMyBatisApplication {

	public static void main(	String[] args) {
		SpringApplication.run(SprinBootWithMyBatisApplication.class, args);
	}	

}
