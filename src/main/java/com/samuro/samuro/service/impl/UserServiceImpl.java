package com.samuro.samuro.service.impl;

import com.samuro.samuro.dto.UserDTO;
import com.samuro.samuro.dto.UserRegistrationDTO;
import com.samuro.samuro.entity.jdbc.UserEntity;
import com.samuro.samuro.mapper.UserJDBCMapper;
import com.samuro.samuro.repository.jdbc.UserJDBCRepository;
import com.samuro.samuro.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserJDBCMapper mapper;
    private final UserJDBCRepository repository;

    @Override
    public UserDTO getById(UUID id) {
        return mapper.toDto(repository.findById(id));
    }

    @Override
    public UserDTO save(UserRegistrationDTO userRegistrationDTO) {
        UserEntity user = mapper.toEntity(userRegistrationDTO.getUserDTO());
        user.setLogin(userRegistrationDTO.getLogin());
        user.setRole(userRegistrationDTO.getUserDTO().getRole().name());
        user.setPassword(userRegistrationDTO.getPassword());
        return mapper.toDto(repository.save(user));
    }

    @Override
    public void deleteById(UUID id) {
//        repository.deleteById(id);
    }
}
