package com.samuro.samuro.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserRegistrationDTO implements Serializable {
    private UserDTO userDTO;
    private String login;
    private String password;
}
