package com.samuro.samuro.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Data
public class CommentDTO implements Serializable {
    private UUID id;
    @NotNull
    private UserDTO author;
    @NotNull
    private ProductDTO product;
    @NotNull
    @Size(min = 5, message = "Минимальое значение - 5")
    private String text;
}
