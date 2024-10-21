package com.example.hexagonal.infrastructure.adapter.orm.configuration;

import com.example.hexagonal.application.repositories.ConfigurationRepository;
import com.example.hexagonal.domain.enums.ConfigurationKeyEnum;
import com.example.hexagonal.domain.enums.ConfigurationValuePasswordLevelEnum;
import com.example.hexagonal.domain.model.configuration.Configuration;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;



@AllArgsConstructor
@Service
public class ConfigurationRepositoryAdapter implements ConfigurationRepository {
    private final ConfigurationRepositoryJpa configurationRepositoryJpa;
    private final ConfigurationMapper configurationMapper;

    @Override
    public Configuration getPasswordLevel() {
        System.out.println("##############################3");
        System.out.println(ConfigurationKeyEnum.CONFIG_PASSWORD_LEVEL.toString());
        try {
            ConfigurationEntity configPasswordLevel = configurationRepositoryJpa.findById(
                    "CONFIG_PASSWORD_LEVEL"
            ).get();
            return configurationMapper.toDomain(configPasswordLevel);
        }catch (Exception e){
            System.out.println("#############ASD#################3");
            System.out.println(e.getMessage());
        }

        return null;

    }
}
