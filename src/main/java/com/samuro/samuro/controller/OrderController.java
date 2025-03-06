package com.samuro.samuro.controller;

import com.samuro.samuro.dto.OrderDTO;
import com.samuro.samuro.service.OrderService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/order")
public class OrderController {
    private final OrderService service;

    @PostMapping
    public ResponseEntity<OrderDTO> save(@Valid @RequestBody OrderDTO orderDTO) {
        return new ResponseEntity<>(service.save(orderDTO), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable UUID id) {
        service.deleteById(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderDTO> getById(@PathVariable UUID id) {
        return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
    }
}
