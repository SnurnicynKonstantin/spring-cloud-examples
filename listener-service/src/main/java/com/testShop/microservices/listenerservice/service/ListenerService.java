package com.testShop.microservices.listenerservice.service;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@EnableRabbit
@Component
public class ListenerService {

    private final HistoryService historyService;

    @Autowired
    public ListenerService(HistoryService historyService) {
        this.historyService = historyService;
    }


    @RabbitListener(queues = "queue1")
    public void processQueue1(String message) {
        historyService.saveHistory(message);
    }
}
