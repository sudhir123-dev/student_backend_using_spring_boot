package com.example.crud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.crud.domain.User;

public interface UserRepository extends MongoRepository<User, Integer> {

	void deleteByMobile(long mobile);
}