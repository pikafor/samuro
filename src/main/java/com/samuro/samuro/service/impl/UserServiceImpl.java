package com.samuro.samuro.service.impl;

import com.samuro.samuro.dto.UserDTO;
import com.samuro.samuro.entity.User;
import com.samuro.samuro.mapper.UserMapper;
import com.samuro.samuro.repository.UserRepository;
import com.samuro.samuro.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserMapper mapper;
    private final UserRepository repository;
    @Override
    public UserDTO getById(UUID id) {
        return mapper.toDto(repository.findById(id).get());
    }

    @Override
    public UserDTO save(UserDTO userDTO, String login, String password) {
        User user = mapper.toEntity(userDTO);
        user.setLogin(login);
        user.setPassword(password);
        return mapper.toDto(repository.save(user));
    }

    @Override
    public void deleteById(UUID id) {
        repository.deleteById(id);
    }
}
