package com.samuro.samuro.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ErrorDTO {
    private LocalDateTime date;
    private String messageError;
}
