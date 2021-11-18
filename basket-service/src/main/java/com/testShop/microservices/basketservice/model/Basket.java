package com.testShop.microservices.basketservice.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Table(name = "basket")
public class Basket {

    @Id
    private Long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "basket")
    private List<BasketProduct> products;
}
