package com.samuro.samuro.service;

import com.samuro.samuro.dto.OrderDTO;

import java.util.UUID;

public interface OrderService {
    OrderDTO save(OrderDTO orderDTO);

    OrderDTO getById(UUID id);

    void deleteById(UUID id);
}
