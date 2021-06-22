package com.example.crud.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.domain.User;
import com.example.crud.dto.UserDto;
import com.example.crud.mapper.MapperClass;
import com.example.crud.repository.UserRepository;

@Service
public class UserServiceImp implements UserService {
	@Autowired
	UserRepository repository;

	@Autowired()
	MapperClass mapper;

	@Override
	public UserDto saveService(UserDto user) {

		return mapper.toDto(repository.save(mapper.toDomain(user)));
	}

	@Override
	public UserDto updateService(UserDto user, Integer id) {
		return mapper.toDto(repository.save(mapper.toDomain(user)));
	}

	@Override
	public List<UserDto> getUser() {
		List<UserDto> userDto = new ArrayList<>();
		List<User> user = repository.findAll();
		user.forEach(data -> {
			userDto.add(mapper.toDto(data));
		});
		return userDto;
	}

	@Override
	public void deleteService(Long mobile) {
		repository.deleteByMobile(mobile);
	}

	@Override
	public Optional<User> getUser(Integer id) {
		return repository.findById(id);
	}

}
