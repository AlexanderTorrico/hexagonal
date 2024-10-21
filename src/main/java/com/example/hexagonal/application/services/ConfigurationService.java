package com.example.hexagonal.application.services;

import com.example.hexagonal.application.repositories.ConfigurationRepository;
import com.example.hexagonal.domain.model.configuration.Configuration;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Service
public class ConfigurationService {

    private final ConfigurationRepository configurationRepository;


    public Configuration getPasswordLevel() {
        return configurationRepository.getPasswordLevel();
    }
}
