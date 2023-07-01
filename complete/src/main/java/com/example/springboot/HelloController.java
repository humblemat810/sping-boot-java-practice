package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import hellogradle.PrintTime;
import java.util.HashMap;
import java.util.Map;

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
	@GetMapping("/timenow2/")
	public Map<String, Object> getMyObject() {
		LocalTime currentTime = LocalTime.now();
        Map<String, Object> obj = new HashMap<>();
        obj.put("time", currentTime.toString());
        return obj;
    }

	
}
