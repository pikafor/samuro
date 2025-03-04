package com.samuro.samuro.controller;

import com.samuro.samuro.dto.OrderDTO;
import com.samuro.samuro.service.OrderService;
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

    @PostMapping("/save")
    public ResponseEntity<OrderDTO> save(@RequestBody OrderDTO orderDTO) {
        return new ResponseEntity<>(service.save(orderDTO), HttpStatus.OK);
    }
    @PostMapping("/delete-by-id")
    public void deleteById(@RequestParam UUID id) {
        service.deleteById(id);
    }
    @GetMapping("/get-by-id")
    public ResponseEntity<OrderDTO> getById(@RequestParam UUID id) {
        return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
    }
}
