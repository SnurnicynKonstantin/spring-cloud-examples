package com.testShop.microservices.storageservice.service;

import com.testShop.microservices.storageservice.model.Product;
import com.testShop.microservices.storageservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        return productRepository.getById(id);
    }

    public Product findByName(String name) {
        return productRepository.findByName(name);
    }
}
