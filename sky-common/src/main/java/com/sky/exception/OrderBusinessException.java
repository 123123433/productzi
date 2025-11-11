package com.sky.exception;

//订单业务异常类
public class OrderBusinessException extends RuntimeException {
    public OrderBusinessException(String message) {
        super(message);
    }
}
