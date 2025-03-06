package com.samuro.samuro.mapper;

import com.samuro.samuro.dto.ProductDTO;
import com.samuro.samuro.entity.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductDTO toDto(Product product);
    Product toEntity(ProductDTO productDTO);
}
