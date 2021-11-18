package com.testShop.microservices.kotlinlistenerservice.service

import org.springframework.amqp.rabbit.annotation.EnableRabbit
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service

@EnableRabbit
@Service
class BasketService

@RabbitListener(queues = ["queue1"])
fun processQueue1(message: String) {
        val a  = message;
//        println(a)
}

