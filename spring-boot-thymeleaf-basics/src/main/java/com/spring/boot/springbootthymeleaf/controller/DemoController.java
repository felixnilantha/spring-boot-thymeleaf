package com.spring.boot.springbootthymeleaf.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/")
	public String getThymeleaf(Model model) {
		
		model.addAttribute("serverDate", new Date());
		
		
		return "welcome-thymeleaf";
	}
}
