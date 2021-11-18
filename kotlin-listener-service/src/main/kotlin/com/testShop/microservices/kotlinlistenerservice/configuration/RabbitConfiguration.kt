package com.testShop.microservices.kotlinlistenerservice.configuration

import org.springframework.amqp.core.AmqpAdmin
import org.springframework.amqp.core.Queue
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory
import org.springframework.amqp.rabbit.connection.ConnectionFactory
import org.springframework.amqp.rabbit.core.RabbitAdmin
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class RabbitConfiguration {
    @Value("\${queue.name}")
    private val queueName: String? = null
    private val LOCALHOST = "localhost"

    @Bean
    open fun connectionFactory(): ConnectionFactory {
        return CachingConnectionFactory(LOCALHOST)
    }

    @Bean
    open fun amqpAdmin(): AmqpAdmin {
        return RabbitAdmin(connectionFactory())
    }

    @Bean
    open fun rabbitTemplate(): RabbitTemplate {
        return RabbitTemplate(connectionFactory())
    }

    @Bean
    open fun myQueue1(): Queue {
        return Queue(queueName)
    }
}
