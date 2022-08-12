package com.softwareinstitute.allen.brandon.ZooAnimals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ZooAnimalsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZooAnimalsApplication.class, args);
	}

	@GetMapping("/allAnimals")
	public String allAnimals(){
		return"This is the response";
	}
}
