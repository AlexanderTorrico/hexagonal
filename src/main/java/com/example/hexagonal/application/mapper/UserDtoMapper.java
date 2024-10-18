package com.example.hexagonal.application.mapper;

import com.example.hexagonal.application.dto.UserDto;
import com.example.hexagonal.domain.user.User;

public class UserDtoMapper {

    public UserDto toDto(User user) {
        return new UserDto(user.getId(), user.getName(), user.getEmail());
    }
}
