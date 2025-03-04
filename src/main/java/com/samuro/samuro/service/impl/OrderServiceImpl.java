package com.samuro.samuro.service.impl;

import com.samuro.samuro.dto.OrderDTO;
import com.samuro.samuro.mapper.OrderMapper;
import com.samuro.samuro.repository.OrderRepository;
import com.samuro.samuro.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderMapper mapper;
    private  final OrderRepository repository;
    @Override
    public OrderDTO save(OrderDTO orderDTO) {
        return mapper.toDto(repository.save(mapper.toEntity(orderDTO)));
    }

    @Override
    public OrderDTO getById(UUID id) {
        return mapper.toDto(repository.findById(id).get());
    }

    @Override
    public void deleteById(UUID id) {
        repository.deleteById(id);
    }
}
