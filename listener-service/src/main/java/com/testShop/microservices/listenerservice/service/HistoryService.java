package com.testShop.microservices.listenerservice.service;

import com.testShop.microservices.listenerservice.model.History;
import com.testShop.microservices.listenerservice.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class HistoryService {

    private final HistoryRepository historyRepository;

    @Autowired
    public HistoryService(HistoryRepository historyRepository) {
        this.historyRepository = historyRepository;
    }

    public List<History> getLastFiveHistoryItems() {
        return historyRepository.findAll(
            PageRequest.of(0, 5, Sort.by(Sort.Direction.ASC, "id"))).getContent();
    }

    public void saveHistory(String message) {
        historyRepository.save(new History(message));
    }
}
