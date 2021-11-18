package com.testShop.microservices.gatewayservice;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfiguration {

    @Bean
    public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
        return builder.routes()
            .route(p -> p.path("/basket/**").uri("lb://BASKET-SERVICE"))
            .route(p -> p.path("/product/**").uri("lb://STORAGE-SERVICE"))
            .build();
    }
}
