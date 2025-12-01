package com.example.hexagonal.application.services;

import com.example.hexagonal.domain.PasswordValdiateService;
import com.example.hexagonal.domain.model.user.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserWithPasswordValidateService {
    private final ConfigurationService configurationService;

    private final UserService userService;

    public User save(User user){
        // WEAK_PASSWORD, MEDIUM_PASSWORD, HARD_PASSWORD
        String passwordStrengt = configurationService.getPasswordLevel().getData();
        new PasswordValdiateService(user.getPassword(), passwordStrengt);

        return userService.save(user);
    }

}
