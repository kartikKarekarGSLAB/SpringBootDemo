package com.gslab.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping(value="/kartik")
	public String displayMessage() {
		return "Kartik";
	}
}
