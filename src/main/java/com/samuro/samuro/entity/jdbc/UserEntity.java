package com.samuro.samuro.entity.jdbc;

import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.UUID;

@Data
public class UserEntity {
    private UUID id;
    private String login;
    private String password;
    private String photo;
    private String nickname;
    private String role;
}
