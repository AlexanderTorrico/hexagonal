package com.example.hexagonal.infrastructure.adapter.orm.user;

import com.example.hexagonal.domain.model.user.User;
import org.springframework.stereotype.Service;

@Service
public class UserMapper {

    public UserEntity toEntity(User user) {
        return new UserEntity(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getPassword(),
                user.getPharmacy_id()
        );
    }

    public User toDomain(UserEntity userEntity) {
        return new User(
                userEntity.getId(),
                userEntity.getName(),
                userEntity.getEmail(),
                userEntity.getPassword(),
                userEntity.getPharmacy_id()
        );
    }
}
