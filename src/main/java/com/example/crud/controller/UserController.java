package com.example.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.domain.User;
import com.example.crud.dto.UserDto;
import com.example.crud.service.UserService;

@RestController
@RequestMapping
@CrossOrigin
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("/create")
	public UserDto createUser(@RequestBody UserDto user) {
		return userService.saveService(user);
	}

	@PutMapping("/update/{id}")
	public UserDto updateUser(@PathVariable int id, @RequestBody UserDto user) {
		return userService.updateService(user, id);
	}

	@GetMapping("/read")
	public List<UserDto> readUser() {
		return userService.getUser();
	}
	
	@GetMapping("/read/{id}")
	public Optional<User> readUser(@PathVariable int id) {
		return userService.getUser(id);
	}

	@DeleteMapping("/delete/{mobile}")
	public void userDelete(@PathVariable Long mobile) {
		userService.deleteService(mobile);
	}
}
