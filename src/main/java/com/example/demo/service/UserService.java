package com.example.demo.service;

import com.example.demo.dto.UserRegisterDto;

public interface UserService {

	//UserRegisterDto create(UserRegisterDto userRegDto);
	String save(UserRegisterDto userRegDto);
}
