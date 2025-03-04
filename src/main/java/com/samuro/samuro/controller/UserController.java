package com.samuro.samuro.controller;

import com.samuro.samuro.dto.UserDTO;
import com.samuro.samuro.dto.UserRegistrationDTO;
import com.samuro.samuro.service.UserService;
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

    @PostMapping("/save")
    public ResponseEntity<UserDTO> save(@RequestBody UserRegistrationDTO userRegistrationDTO) {
        return new ResponseEntity<>(service.save(userRegistrationDTO.getUserDTO(),
                userRegistrationDTO.getLogin(),
                userRegistrationDTO.getPassword()), HttpStatus.OK);
    }
    @PostMapping("/delete-by-id")
    public void deleteById(@RequestParam UUID id) {
        service.deleteById(id);
    }
    @GetMapping("/get-by-id")
    public ResponseEntity<UserDTO> getUserById(@RequestParam UUID id) {
        return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
    }
}
