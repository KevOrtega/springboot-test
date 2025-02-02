package com.kevortega.spring.springboot_test.services;

import java.util.List;
import java.util.UUID;

import com.kevortega.spring.springboot_test.models.Product;

public interface ProductService {
    List<Product> getAll();
    Product getById(UUID id);
}
