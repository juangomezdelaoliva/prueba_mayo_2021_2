package com.example.micro_1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Micontrolador {
	
	@GetMapping("/")
	public String hello() {
		return "hello ANTONIO";
	}

}
