package com.example.crud.service;

import java.util.List;
import java.util.Optional;

import com.example.crud.domain.User;
import com.example.crud.dto.UserDto;

public interface UserService {
	UserDto saveService(UserDto user);

	UserDto updateService(UserDto user, Integer id);
	
	 Optional<User> getUser(Integer id);

	List<UserDto> getUser();

	void deleteService(Long mobile);
}
