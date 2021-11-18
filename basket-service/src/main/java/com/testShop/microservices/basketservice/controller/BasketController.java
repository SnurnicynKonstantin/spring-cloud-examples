package com.testShop.microservices.basketservice.controller;

import com.testShop.microservices.basketservice.dto.BasketDto;
import com.testShop.microservices.basketservice.service.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basket")
public class BasketController {

    private final BasketService basketService;

    @Autowired
    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/{id}")
    public BasketDto getBasketById(@PathVariable Long id) {
        return basketService.getBasketById(id);
    }
}
