package com.samuro.samuro.entity;

import com.samuro.samuro.dto.ProductDTO;
import com.samuro.samuro.dto.UserDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name = "orders")
public class Order {
    @Id
    private UUID id;
    @ManyToOne
    private User seller;
    @ManyToOne
    private User buyer;
    @ManyToOne
    private Product product;
}
