package com.testShop.microservices.basketservice.proxy;

import com.testShop.microservices.basketservice.dto.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="storage-service")
public interface StorageProxy {

    @GetMapping("/product")
    List<ProductDto> getAllProducts();

    @GetMapping("/product/id/{id}")
    ProductDto getProductById(@PathVariable Long id);
}
