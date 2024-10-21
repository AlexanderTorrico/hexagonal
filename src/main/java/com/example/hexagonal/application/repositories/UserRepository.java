package com.example.hexagonal.application.repositories;

import com.example.hexagonal.domain.model.user.User;
import org.springframework.stereotype.Service;

@Service
public interface UserRepository {

    public User findById(long id);
    public User save(User user);
}
