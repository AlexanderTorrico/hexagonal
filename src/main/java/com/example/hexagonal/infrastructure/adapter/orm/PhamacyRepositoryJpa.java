package com.example.hexagonal.infrastructure.adapter.orm;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface PhamacyRepositoryJpa extends JpaRepository<PharmacyEntity, Long> {
}
