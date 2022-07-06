package com.deepspace.datatracker.config;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(value = {RuntimeException.class})
    public Map<String, Object> handleRuntimeException(RuntimeException e) {
        Map<String, Object> response = new HashMap<>(3);
        response.put("timestamp", LocalDateTime.now());
        response.put("message", e.getMessage());
        response.put("cause", e.getCause());
        return response;
    }
}
