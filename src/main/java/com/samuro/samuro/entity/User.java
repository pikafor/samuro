package com.samuro.samuro.entity;

import com.samuro.samuro.dto.enums.UserRole;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String login;
    private String password;
    private String photo;
    @Size(min = 3, message = "Минимальое значение - 3")
    private String nickname;
    private String role;
}
