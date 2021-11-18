package com.testShop.microservices.basketservice.dto;

import lombok.Data;

@Data
public class ProductDto {
    private Integer id;
    private String name;
    private Integer price;
}
