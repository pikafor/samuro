package com.samuro.samuro.ingress.controller;

import com.samuro.samuro.dto.ProductDTO;
import com.samuro.samuro.service.ProductService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/product")
public class ProductController {
    private final ProductService service;

    @PostMapping
    public ResponseEntity<ProductDTO> save(@Valid @RequestBody ProductDTO productDTO) {
        return new ResponseEntity<>(service.save(productDTO), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable UUID id) {
        service.deleteById(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getById(@PathVariable UUID id) {
        return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
    }
}
