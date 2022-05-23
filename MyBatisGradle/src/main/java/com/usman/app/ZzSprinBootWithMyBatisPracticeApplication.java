package com.usman.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan({"com.usman.controller.RestAPI.class"})
@SpringBootApplication(scanBasePackages = {"com.usman.controller","com.usman.model"})
public class ZzSprinBootWithMyBatisPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZzSprinBootWithMyBatisPracticeApplication.class, args);
	}

}
