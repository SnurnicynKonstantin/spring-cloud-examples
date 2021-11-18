package com.testShop.microservices.basketservice.repository;

import com.testShop.microservices.basketservice.model.Basket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasketRepository  extends JpaRepository<Basket, Long> {
}
