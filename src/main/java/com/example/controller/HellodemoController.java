package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellodemoController {

	@GetMapping
	public String getMessage() {
		System.out.println("############");
		return "Hello world";
	}
}
