package com.example.demo.modelmapper;

import com.example.demo.dto.UserRegisterDto;
import com.example.demo.model.User;

public class UserMapper {

//	@Autowired
//	private static PasswordEncoder passwordEncoder;

	public static UserRegisterDto mapToUserDto(User user) {

		UserRegisterDto uDto = new UserRegisterDto();
		uDto.setFirstName(user.getFirstName());
		uDto.setLastName(user.getLastName());
		uDto.setEmail(user.getEmail());
		//uDto.setPassword(passwordEncoder.encode(user.getPassword()));
		uDto.setPassword(user.getPassword());
		return uDto;

	}

	public static User mapToUser(UserRegisterDto userRegisterDto) {
		User user = new User();
		user.setFirstName(userRegisterDto.getFirstName());
		user.setLastName(userRegisterDto.getLastName());
		user.setEmail(userRegisterDto.getEmail());
		//user.setPassword(passwordEncoder.encode(userRegisterDto.getPassword()));
		user.setPassword(userRegisterDto.getPassword());
		return user;

	}
}
