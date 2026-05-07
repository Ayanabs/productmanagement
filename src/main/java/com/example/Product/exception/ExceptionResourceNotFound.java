package com.example.Product.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class ExceptionResourceNotFound extends RuntimeException {
    public ExceptionResourceNotFound(String message) {
        super(message);
    }
}
