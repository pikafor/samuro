package com.samuro.samuro.service;

import com.samuro.samuro.dto.UserDTO;
import com.samuro.samuro.dto.UserRegistrationDTO;

import java.util.UUID;

public interface UserService {
    UserDTO getById(UUID id);

    UserDTO save(UserRegistrationDTO userRegistrationDTO);

    void deleteById(UUID id);
}
