package com.kevortega.spring.springboot_test.repositories;

import java.util.List;
import java.util.UUID;

import com.kevortega.spring.springboot_test.models.Product;

public interface ProductRepository {
    List<Product> findAll();
    Product findById(UUID id);
}
