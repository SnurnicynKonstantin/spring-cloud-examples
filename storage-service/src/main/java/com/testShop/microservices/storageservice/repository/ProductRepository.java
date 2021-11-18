package com.testShop.microservices.storageservice.repository;

import com.testShop.microservices.storageservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findByName(String name);

}
