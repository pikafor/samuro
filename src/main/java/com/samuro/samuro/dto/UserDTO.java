package com.samuro.samuro.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Data
public class UserDTO implements Serializable {
    private UUID id;
    @NotNull
    @Size(min = 3, message = "Минимальое значение - 3")
    private String nickname;
    private String photo;
}
