package com.testShop.microservices.basketservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
public class BasketDto {
    private Long id;
    private String name;
    private Set<ProductDto> products;
}
