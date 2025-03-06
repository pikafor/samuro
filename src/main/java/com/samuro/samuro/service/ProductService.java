package com.samuro.samuro.service;

import com.samuro.samuro.dto.ProductDTO;

import java.util.UUID;

public interface ProductService {
    ProductDTO save(ProductDTO productDTO);

    ProductDTO getById(UUID id);

    void deleteById(UUID id);
}
