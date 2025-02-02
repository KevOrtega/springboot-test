package com.kevortega.spring.springboot_test.controllers;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kevortega.spring.springboot_test.models.Product;
import com.kevortega.spring.springboot_test.services.ProductService;

@RestController
@RequestMapping("api/product")
public class ProductController {
	
	private ProductService productService = new ProductService();
	
	@GetMapping("/")
	public Iterable<Product> getAll() {
		return this.productService.getAll();
	}
	
	@GetMapping("/{id}")
	public Product getById(@PathVariable UUID id) {
		return this.productService.getById(id);
	}
	
}
