package com.kevortega.spring.springboot_test.repositories;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import com.kevortega.spring.springboot_test.models.Product;

public class ProductRepository {
    private List<Product> products;
    
    public ProductRepository() {
        this.products = Arrays.asList(
            new Product("Product 1", 1099),
            new Product("Product 2", 1999),
            new Product("Product 3", 999)
        );
    }
    
    public List<Product> findAll() {
        return this.products;
    }
    
    public Product findById(UUID id) {
        return this.products.stream()
            .filter(p -> p.getId().equals(id))
            .findFirst()
            .orElse(null);
    }
}
