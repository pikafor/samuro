package com.samuro.samuro.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Data
public class CommentDTO implements Serializable {
    private UUID id;
    private UserDTO author;
    private ProductDTO product;
    private String text;
}
