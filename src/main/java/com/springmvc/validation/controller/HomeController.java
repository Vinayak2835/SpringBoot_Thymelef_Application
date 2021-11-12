package com.springmvc.validation.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springmvc.validation.entities.LoginData;

@Controller
public class HomeController {
	
	@GetMapping("/sign-in")
	public String formValidation(Model model) {
		
		model.addAttribute("loginData", new LoginData());
		
		return "form";
	}
	
	@PostMapping("/process")
	public String success(@Valid @ModelAttribute("loginData") LoginData loginData , BindingResult result ) {
		
		if(result.hasErrors()) {
			System.out.println(result);
			return "form";
		}
		System.out.println(loginData);
		return "success";		
	 }
}
