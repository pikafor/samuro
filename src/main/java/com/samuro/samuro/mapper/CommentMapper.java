package com.samuro.samuro.mapper;

import com.samuro.samuro.dto.CommentDTO;
import com.samuro.samuro.entity.Comment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CommentMapper {
    CommentDTO toDto(Comment comment);
    Comment toEntity(CommentDTO commentDTO);
}
