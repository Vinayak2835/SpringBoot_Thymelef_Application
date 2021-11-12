package com.springmvc.validation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExampleController {
	
	@GetMapping("/example")
	public String example() {
		return "example";
	}
}