package com.samuro.samuro.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name = "orders")
public class Order {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private UUID id;
    @ManyToOne
    private User seller;
    @ManyToOne
    private User buyer;
    @ManyToOne
    private Product product;
}
