package com.samuro.samuro.mapper;

import com.samuro.samuro.dto.OrderDTO;
import com.samuro.samuro.entity.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderDTO toDto(Order order);
    Order toEntity(OrderDTO orderDTO);
}
