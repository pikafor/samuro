package com.samuro.samuro.service;

import com.samuro.samuro.dto.UserDTO;

import java.util.UUID;

public interface UserService {
    UserDTO getById(UUID id);

    UserDTO save(UserDTO userDTO, String login, String password);

    void deleteById(UUID id);
}
