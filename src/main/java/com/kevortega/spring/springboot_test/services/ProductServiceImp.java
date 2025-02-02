package com.kevortega.spring.springboot_test.services;

import java.util.List;
import java.util.UUID;

import com.kevortega.spring.springboot_test.models.Product;
import com.kevortega.spring.springboot_test.repositories.ProductRepositoryImp;

public class ProductServiceImp implements ProductService {
    
    private final ProductRepositoryImp productRepository = new ProductRepositoryImp();
    
    public List<Product> getAll() {
        return productRepository.findAll().stream()
                .map(p -> {
                    Product product = (Product) p.clone();
                    product.setPrice((int) (p.getPrice() * 1.5));
                    return product;
                })
                .collect(java.util.stream.Collectors.toList());
    }
    
    public Product getById(UUID id) {
        return productRepository.findById(id);
    }
    
}

