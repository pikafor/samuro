package com.samuro.samuro.service;

import com.samuro.samuro.dto.CommentDTO;

import java.util.UUID;

public interface CommentService {
    CommentDTO save(CommentDTO commentDTO);
    CommentDTO getById(UUID id);
    void deleteById(UUID id);
}
