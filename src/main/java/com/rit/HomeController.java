package com.rit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping
	public String home() {
		return "Welcome Home";
	}
	
	@GetMapping("/page1")
	public String page1() {
		return "Welcome Page1";
	}
}
