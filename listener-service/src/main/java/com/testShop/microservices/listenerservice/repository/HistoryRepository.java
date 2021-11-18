package com.testShop.microservices.listenerservice.repository;

import com.testShop.microservices.listenerservice.model.History;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryRepository extends JpaRepository<History, Long> {
}
