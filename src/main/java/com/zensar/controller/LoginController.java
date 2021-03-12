package com.zensar.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
		
	@PostMapping(value="/login/{username}/{password}")
	public String login(@PathVariable("username")String uname,@PathVariable("password")String password) {
		System.out.println("hello");
		if(uname.equals("Zensar")&& password.equals("zensar")) {
			return "slogin.html";
			
		}
		else {
			return "flogin.html";
		}
	}
}
