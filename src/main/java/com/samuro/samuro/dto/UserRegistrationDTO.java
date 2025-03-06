package com.samuro.samuro.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserRegistrationDTO implements Serializable {
    @Valid
    private UserDTO userDTO;
    @NotNull
    private String login;
    @NotNull
    @Size(min = 6, message = "Минимальое значение - 6")
    private String password;
}
