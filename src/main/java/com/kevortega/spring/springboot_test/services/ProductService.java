package com.kevortega.spring.springboot_test.services;

import java.util.List;
import java.util.UUID;

import com.kevortega.spring.springboot_test.models.Product;
import com.kevortega.spring.springboot_test.repositories.ProductRepository;

public class ProductService {
    
    private final ProductRepository productRepository = new ProductRepository();
    
    public List<Product> getAll() {
        return productRepository.findAll().stream()
                .map(p -> {
                    Double updatedPrice = p.getPrice() * 1.50d;
                    Product product = new Product(p.getName(), updatedPrice.intValue());
                    product.setId(p.getId());
                    return product;
                })
                .collect(java.util.stream.Collectors.toList());
    }
    
    public Product getById(UUID id) {
        return productRepository.findById(id);
    }
    
}

