package com.samuro.samuro.entity;

import com.samuro.samuro.dto.CommentDTO;
import com.samuro.samuro.dto.UserDTO;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String title;
    private String description;
    @ManyToOne
    private User seller;
    private double price;
}
