package com.example.spring1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Spring1Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring1Application.class, args);
	}

	@GetMapping("/spring1")
	public String springOne(@RequestParam(value = "helloWorld", defaultValue = "World!") String helloWorld) {
		return String.format("Hello, %s",helloWorld);
	}

}
