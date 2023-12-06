package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserRegisterDto;
import com.example.demo.service.LoginService;

@RestController
@RequestMapping("/api")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@PostMapping("/login/{id}")
	public String login(@PathVariable int id, @RequestBody UserRegisterDto user) {
//		try {
//			return loginService.signIn(id, user);
//		} catch (Exception e) {
//			// Handle the exception or log it
//			// e.printStackTrace(); // Example: printing the stack trace
//			return "An error occurred during login.";
//		}
		return loginService.signIn(id, user);
	}
}
