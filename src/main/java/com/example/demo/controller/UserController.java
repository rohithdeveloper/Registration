package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserRegisterDto;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/registration")
public class UserController {

	@Autowired
	private UserService userService;
	
//	@PostMapping("/user")
//	public UserRegisterDto register(@RequestBody UserRegisterDto registrationDto) {
//		return userService.create(registrationDto);
//		
//	}
	@PostMapping("/user")
	public String register2(@RequestBody UserRegisterDto registrationDto) {
		return userService.save(registrationDto);
		
	}
	
}
