package com.sky.exception;

//民马修改失败异常
public class PasswordEditFailedException extends RuntimeException {
    public PasswordEditFailedException(String message) {
        super(message);
    }
}
