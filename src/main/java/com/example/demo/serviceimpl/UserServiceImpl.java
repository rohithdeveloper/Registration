package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserRegisterDto;
import com.example.demo.exception.RegistrationException;
import com.example.demo.model.User;
import com.example.demo.modelmapper.UserMapper;
import com.example.demo.respository.UserRepository;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

//	@Override
//	public UserRegisterDto create(UserRegisterDto userRegDto) {
//		// TODO Auto-generated method stub
//		User existingUserName=userRepo.findByFirstName(userRegDto.getFirstName());
//		if(existingUserName!=null) {
//		throw new RegistrationException("User name already exists"+userRegDto.getFirstName());
//			
//		}
//		User user = UserMapper.mapToUser(userRegDto);
//		User savedUser = userRepo.save(user);
//		UserRegisterDto userDto = UserMapper.mapToUserDto(savedUser);
//		return userDto;
//	}

	@Override
	public String save(UserRegisterDto userRegDto) {
		// TODO Auto-generated method stub
		User existingUserName=userRepo.findByFirstName(userRegDto.getFirstName());
		if(existingUserName!=null) {
		//throw new RegistrationException("User name already exists :"+userRegDto.getFirstName());
			return "User Already exists";
		}
		User user = UserMapper.mapToUser(userRegDto);
		User savedUser = userRepo.save(user);
		UserRegisterDto userDto = UserMapper.mapToUserDto(savedUser);
		return "User Registered Successfully";
		
	}
		

		
	
}
