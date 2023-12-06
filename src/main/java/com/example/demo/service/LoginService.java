package com.example.demo.service;

import com.example.demo.dto.UserRegisterDto;

public interface LoginService {
	
	//UserRegisterDto signIn(int id,UserRegisterDto userRegDto);
	String signIn(int id,UserRegisterDto userRegDto);
}
