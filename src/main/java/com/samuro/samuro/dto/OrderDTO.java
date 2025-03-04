package com.samuro.samuro.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Data
public class OrderDTO implements Serializable {
    private UUID id;
    private UserDTO seller;
    private UserDTO buyer;
    private ProductDTO product;
}
