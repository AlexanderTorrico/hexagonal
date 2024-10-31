package com.example.hexagonal.product.infrastructure.adapter.orm.product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositoryJpa extends JpaRepository<ProductEntity, Long> {
}