package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import hellogradle.PrintTime;
@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	@GetMapping("/timenow/")
	public String timenow() {
		LocalTime currentTime = LocalTime.now();
		PrintTime.main();
		return "Current time: " + currentTime.toString();
	}
}
