package com.samuro.samuro.controller;

import com.samuro.samuro.dto.ProductDTO;
import com.samuro.samuro.service.ProductService;
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

    @PostMapping("/save")
    public ResponseEntity<ProductDTO> save(@RequestBody ProductDTO productDTO) {
        return new ResponseEntity<>(service.save(productDTO), HttpStatus.OK);
    }
    @PostMapping("/delete-by-id")
    public void deleteById(@RequestParam UUID id) {
        service.deleteById(id);
    }
    @GetMapping("/get-by-id")
    public ResponseEntity<ProductDTO> getById(@RequestParam UUID id) {
        return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
    }
}
