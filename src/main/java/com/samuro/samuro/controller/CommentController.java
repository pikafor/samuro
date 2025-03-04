package com.samuro.samuro.controller;

import com.samuro.samuro.dto.CommentDTO;
import com.samuro.samuro.service.CommentService;
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

    @PostMapping("/save")
    public ResponseEntity<CommentDTO> save(@RequestBody CommentDTO commentDTO) {
        return new ResponseEntity<>(service.save(commentDTO), HttpStatus.OK);
    }
    @PostMapping("delete-by-id")
    public void deleteById(@RequestParam UUID id) {
        service.deleteById(id);
    }
    @GetMapping("/get-by-id")
    public ResponseEntity<CommentDTO> getById(@RequestParam UUID id){
        return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
    }
}
