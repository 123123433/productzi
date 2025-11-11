package com.sky.exception;

public class UserNotLoginException extends RuntimeException {
    public UserNotLoginException(String message) {
        super(message);
    }
}
