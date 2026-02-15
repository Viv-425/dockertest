package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellodemoController {

	@GetMapping("/message")
	public String getMessage() {
		System.out.println("############");
		System.out.println("hello from docker");
		return "Hello world";
	}
}
