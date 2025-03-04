package com.samuro.samuro.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Data
public class NewProductDTO implements Serializable {
    private String title;
    private String description;
    private UUID sellerId;
    private double price;
}
