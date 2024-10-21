package com.example.hexagonal.infrastructure.adapter.orm.user;

import com.example.hexagonal.application.repositories.UserRepository;
import com.example.hexagonal.domain.model.user.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class UserRepositoryAdapter implements UserRepository {
    private final UserRepositoryJpa userRepositoryJpa;
    private final UserMapper userMapper;


    @Override
    public User findById(long id) {
        UserEntity userEntity = userRepositoryJpa.findById(id).get();
        return userMapper.toDomain(userEntity);
    }

    @Override
    public User save(User user) {

        return userMapper.toDomain(
            userRepositoryJpa.save(
                userMapper.toEntity(user)
            )
        );
    }
}
