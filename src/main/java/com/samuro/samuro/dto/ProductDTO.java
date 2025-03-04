package com.samuro.samuro.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Data
public class ProductDTO implements Serializable {
    private UUID id;
    private String title;
    private String description;
    private UserDTO seller;
    private double price;
}
