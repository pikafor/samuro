package com.samuro.samuro.repository.jpa;

import com.samuro.samuro.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CommentRepository extends JpaRepository<Comment, UUID> {
}
