package com.testShop.microservices.storageservice.config;

import org.springframework.cloud.config.client.RetryProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.retry.interceptor.RetryInterceptorBuilder;
import org.springframework.retry.interceptor.RetryOperationsInterceptor;

@Configuration
public class StorageServiceConfig {
//    @Bean
//    public RetryOperationsInterceptor configServerRetryInterceptor(RetryProperties properties) {
//        return RetryInterceptorBuilder
//            .stateless()
//            .backOffOptions(properties.getInitialInterval(),
//                properties.getMultiplier(),
//                properties.getMaxInterval())
//            .maxAttempts(properties.getMaxAttempts()).build();
//    }
}
