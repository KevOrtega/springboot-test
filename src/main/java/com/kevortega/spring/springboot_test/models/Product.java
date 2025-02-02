package com.kevortega.spring.springboot_test.models;

import java.util.UUID;

public class Product implements Cloneable {
    private UUID id;
    private String name;
    private int price;

    public Product(String name, int price) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.price = price;
    }

    public UUID getId() {
        return id;
    }

    private void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            Product product = new Product(this.name, this.price);
            product.setId(this.id);
            return product;
        }
    }
}

