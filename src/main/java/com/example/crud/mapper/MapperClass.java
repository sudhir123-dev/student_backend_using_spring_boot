package com.example.crud.mapper;

import org.mapstruct.Mapper;

import com.example.crud.domain.User;
import com.example.crud.dto.UserDto;

@Mapper(componentModel = "spring")
public interface MapperClass {
   User toDomain(UserDto dto);
   UserDto toDto(User user);
}
