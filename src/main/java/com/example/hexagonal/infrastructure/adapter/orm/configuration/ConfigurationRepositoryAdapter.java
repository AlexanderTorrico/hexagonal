package com.example.hexagonal.infrastructure.adapter.orm.configuration;

import com.example.hexagonal.application.repositories.ConfigurationRepository;
import com.example.hexagonal.domain.enums.ConfigurationKeyEnum;
import com.example.hexagonal.domain.enums.ConfigurationValuePasswordLevelEnum;
import com.example.hexagonal.domain.model.configuration.Configuration;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;



@AllArgsConstructor

public class ConfigurationRepositoryAdapter implements ConfigurationRepository {
    private final ConfigurationRepositoryJpa configurationRepositoryJpa;
    private ConfigurationMapper configurationMapper;

    @Override
    public Configuration getPasswordLevel() {

        ConfigurationEntity configPasswordLevel = configurationRepositoryJpa.findById(
                ConfigurationKeyEnum.CONFIG_PASSWORD_LEVEL.toString()
        ).get();
        return configurationMapper.toDomain(configPasswordLevel);

    }
}
