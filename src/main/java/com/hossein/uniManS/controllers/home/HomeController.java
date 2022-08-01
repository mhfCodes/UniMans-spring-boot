package com.hossein.uniManS.controllers.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/UniManS")
public class HomeController {

	@GetMapping
	public String getHome() {
		return "Welcome To UniManS";
	}
	
}
