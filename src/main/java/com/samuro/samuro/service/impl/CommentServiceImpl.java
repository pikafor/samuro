package com.samuro.samuro.service.impl;

import com.samuro.samuro.dto.CommentDTO;
import com.samuro.samuro.mapper.CommentMapper;
import com.samuro.samuro.repository.jpa.CommentRepository;
import com.samuro.samuro.service.CommentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class CommentServiceImpl implements CommentService {
    private final CommentMapper mapper;
    private final CommentRepository repository;
    @Override
    public CommentDTO save(CommentDTO commentDTO) {
        return mapper.toDto(repository.save(mapper.toEntity(commentDTO)));
    }

    @Override
    public CommentDTO getById(UUID id) {
        return mapper.toDto(repository.findById(id).get());
    }

    @Override
    public void deleteById(UUID id) {
        repository.deleteById(id);
    }
}
