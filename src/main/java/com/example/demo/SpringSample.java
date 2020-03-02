package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSample {

	@RequestMapping("/login")
	public String login() {
		return "login method";
	}
	
	@RequestMapping("/")
	public String index() {
		return "Hello World";
	}
}
