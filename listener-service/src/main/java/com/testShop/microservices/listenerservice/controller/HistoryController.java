package com.testShop.microservices.listenerservice.controller;

import com.testShop.microservices.listenerservice.model.History;
import com.testShop.microservices.listenerservice.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/history")
public class HistoryController {

    private final HistoryService historyService;

    @Autowired
    public HistoryController(HistoryService historyService) {
        this.historyService = historyService;
    }

    @GetMapping
    public List<History> getBasketById() {
        return historyService.getLastFiveHistoryItems();
    }

}
