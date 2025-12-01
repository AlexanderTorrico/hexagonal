package com.example.hexagonal.infrastructure.controller;


import com.example.hexagonal.application.dto.UserDto;
import com.example.hexagonal.application.services.UserService;
import com.example.hexagonal.application.services.UserWithPasswordValidateService;
import com.example.hexagonal.domain.model.user.User;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")

@AllArgsConstructor
public class UserController {
    private final UserService userService;
    private final UserWithPasswordValidateService userWithPasswordValidateService;
    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/{id}")
    public UserDto findById(@PathVariable Long id) {
        log.info("User:212 " );
        System.out.println("User25: _____________");
        return userService.findById(id);
    }

    @PostMapping
    public User save(@RequestBody User user) {
        log.info("User: " );
        System.out.println("User32: _____________");
        return userWithPasswordValidateService.save(user);
    }

}
