package com.hossein.uniManS.controllers.home;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/UniManS")
public class HomeController {

	@GetMapping("/home")
	@PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_TEACHER', 'ROLE_STUDENT')")
	public String getHome() {
		return "Welcome To UniManS";
	}
	
}
