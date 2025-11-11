package com.sky.exception;

//套餐启用失败异常
public class SetmealEnableFailedException extends RuntimeException {
    public SetmealEnableFailedException(){
    }
    public SetmealEnableFailedException(String message) {
        super(message);
    }
}
