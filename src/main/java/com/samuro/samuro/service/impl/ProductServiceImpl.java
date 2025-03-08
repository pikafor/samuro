package com.samuro.samuro.service.impl;

import com.samuro.samuro.dto.ProductDTO;
import com.samuro.samuro.mapper.ProductMapper;
import com.samuro.samuro.repository.jpa.ProductRepository;
import com.samuro.samuro.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductMapper mapper;
    private  final ProductRepository repository;

    @Override
    public ProductDTO save(ProductDTO productDTO) {

        return mapper.toDto(repository.save(mapper.toEntity(productDTO)));
    }

    @Override
    public ProductDTO getById(UUID id) {
        return mapper.toDto(repository.findById(id).get());
    }

    @Override
    public void deleteById(UUID id) {
        repository.deleteById(id);
    }

}
