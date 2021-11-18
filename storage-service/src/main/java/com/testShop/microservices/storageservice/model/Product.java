package com.testShop.microservices.storageservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "product")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer" })
public class Product {
    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private Integer price;
}
