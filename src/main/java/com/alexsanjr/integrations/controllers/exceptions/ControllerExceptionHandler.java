package com.alexsanjr.integrations.controllers.exceptions;

import com.alexsanjr.integrations.entities.StandardError;
import com.alexsanjr.integrations.services.exceptions.EmailException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(EmailException.class)
    public ResponseEntity<StandardError> Email(EmailException e, HttpServletRequest request) {
        HttpStatus status = HttpStatus.BAD_REQUEST;
        StandardError err = new StandardError(Instant.now(), status.value(), "Email Error" ,e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }
}
