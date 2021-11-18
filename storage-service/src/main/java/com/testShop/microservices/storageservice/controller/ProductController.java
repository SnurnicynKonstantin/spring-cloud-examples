package com.testShop.microservices.storageservice.controller;

import com.testShop.microservices.storageservice.model.Product;
import com.testShop.microservices.storageservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService storageService;

    @Autowired
    public ProductController(ProductService storageService) {
        this.storageService = storageService;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return storageService.getAllProducts();
    }

    @GetMapping("id/{id}")
    public Product getById(@PathVariable("id") Long id) {
        return storageService.findById(id);
    }

    @GetMapping("name/{name}")
    public Product getByName(@PathVariable("name") String name) {
        return storageService.findByName(name);
    }

}
