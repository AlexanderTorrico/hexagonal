package com.example.hexagonal.application.services;

import com.example.hexagonal.application.dto.UserDto;
import com.example.hexagonal.application.mapper.UserDtoMapper;
import com.example.hexagonal.application.repositories.UserRepository;
import com.example.hexagonal.domain.user.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserDto findById(long id) {
        UserDtoMapper userDtoMapper = new UserDtoMapper();

        return userDtoMapper.toDto(
            userRepository.findById(id)
        );
    }

    public User save(User user) {
        return userRepository.save(user);
    }
}
