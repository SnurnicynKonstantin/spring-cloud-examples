package com.testShop.microservices.basketservice.service;

import com.testShop.microservices.basketservice.dto.BasketDto;
import com.testShop.microservices.basketservice.dto.ProductDto;
import com.testShop.microservices.basketservice.model.Basket;
import com.testShop.microservices.basketservice.model.BasketProduct;
import com.testShop.microservices.basketservice.proxy.StorageProxy;
import com.testShop.microservices.basketservice.repository.BasketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.amqp.core.AmqpTemplate;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class BasketService {

    @Value("${queue.name}")
    private String queueName;

    private final BasketRepository basketRepository;
    private final StorageProxy storageProxy;
//    private final AmqpTemplate template;

    @Autowired
//    public BasketService(BasketRepository basketRepository, StorageProxy storageProxy, AmqpTemplate template) {
    public BasketService(BasketRepository basketRepository, StorageProxy storageProxy) {
        this.basketRepository = basketRepository;
        this.storageProxy = storageProxy;
//        this.template = template;
    }

    public BasketDto getBasketById(Long id) {
        Basket basket = basketRepository.getById(id);
        Set<Integer> productIds = basket.getProducts().stream().map(BasketProduct::getProductId).collect(Collectors.toSet());
        Set<ProductDto> productsFromProductService = storageProxy.getAllProducts().stream().filter(product -> productIds.contains(product.getId())).collect(Collectors.toSet());
//        template.convertAndSend(queueName,"Message to queue");
        return new BasketDto(basket.getId(), basket.getName(), productsFromProductService);
//        return null;
    }
}
