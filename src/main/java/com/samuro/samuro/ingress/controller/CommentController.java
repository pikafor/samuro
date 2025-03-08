package com.samuro.samuro.ingress.controller;

import com.samuro.samuro.dto.CommentDTO;
import com.samuro.samuro.service.CommentService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/comment")
public class CommentController {
    private final CommentService service;


    @PostMapping
    public ResponseEntity<CommentDTO> save(@Valid @RequestBody CommentDTO commentDTO) {
        return new ResponseEntity<>(service.save(commentDTO), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable UUID id) {
        service.deleteById(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CommentDTO> getById(@PathVariable UUID id){
        return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
    }
}
