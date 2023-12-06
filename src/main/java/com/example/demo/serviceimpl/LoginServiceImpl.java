package com.example.demo.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserRegisterDto;
//import com.example.demo.exception.InvalidCredentialsException;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.model.User;
import com.example.demo.respository.UserRepository;
import com.example.demo.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public String signIn(int id, UserRegisterDto userRegDto) {
		// TODO Auto-generated method stub
		Optional<User> user1=userRepo.findById(id);
		 if (user1.isPresent()) {
		        User user = user1.get();
		        String email = user.getEmail();
		        String password = user.getPassword();
		        
		        String inputEmail = userRegDto.getEmail();
		        String inputPassword = userRegDto.getPassword();
		        if (email.equals(inputEmail) && password.equals(inputPassword)) {
		            return "Login successful";
		        } else {
		            //throw new InvalidCredentialsException("Bad Credential");
		        	return "Bad credentials";
		        }
		 }
		        else {
		            // Handle the case where the user is not found
		            throw new UserNotFoundException("User with id "+ id + " not found");
		        }
	
	}

//	@Override
//	public String signIn(int id, UserRegisterDto userRegDto) {
//		// TODO Auto-generated method stub
//		Optional<User> user1=userRepo.findById(id);
//		String inputEmail=userRegDto.getEmail();
//		String inputPassword=userRegDto.getPassword();
//		if(user1.isPresent()) {
//			String email=user1.get().getEmail();
//			String pass=user1.get().getPassword();
//			if(email.equals(inputEmail) && pass.equals(inputPassword)) {
//				return "Login successfull";
//			}
//			else {
//				throw new InvalidCredentialsException("Bad Credential");
//			}
//		}
//		//return userRegDto;
//		return "Login successfull";
//	}

}
