package com.samuro.samuro.controller;

import com.samuro.samuro.dto.UserDTO;
import com.samuro.samuro.dto.UserRegistrationDTO;
import com.samuro.samuro.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService service;

    @PostMapping
    public ResponseEntity<UserDTO> save(@Valid @RequestBody UserRegistrationDTO userRegistrationDTO) {
        UserDTO userDTO = service.save(userRegistrationDTO.getUserDTO(),
                userRegistrationDTO.getLogin(),
                userRegistrationDTO.getPassword());
        ResponseEntity responseEntity = new ResponseEntity<>(userDTO, HttpStatus.OK);
        return responseEntity;
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable UUID id) {
        service.deleteById(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getById(@PathVariable UUID id) {
        return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
    }
}
