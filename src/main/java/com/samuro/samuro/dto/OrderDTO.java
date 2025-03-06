package com.samuro.samuro.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Data
public class OrderDTO implements Serializable {
    private UUID id;
    @NotNull
    private UserDTO seller;
    @NotNull
    private UserDTO buyer;
    @NotNull
    private ProductDTO product;
}
