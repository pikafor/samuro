package com.samuro.samuro.handler;

import com.samuro.samuro.dto.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
        public ResponseEntity<ErrorDTO> handleValidationExceptions(MethodArgumentNotValidException ex) {
        ErrorDTO errors = new ErrorDTO();
        errors.setDate(LocalDateTime.now());

        String defaultMessage = "Неверно заполнено поле ";
        StringBuilder responseMessage = new StringBuilder();

        for (FieldError error : ex.getFieldErrors()) {
            responseMessage.append(defaultMessage + error.getField() + ' ' + error.getDefaultMessage() + ' ');
        }

        errors.setMessageError(responseMessage.toString());

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors);
    }
}
