package com.samuro.samuro.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Data
public class UserDTO implements Serializable {
    private UUID id;
    private String nickname;
    private String photo;
}
