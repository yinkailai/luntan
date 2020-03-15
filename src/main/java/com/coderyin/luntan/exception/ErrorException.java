package com.coderyin.luntan.exception;

public class ErrorException extends RuntimeException {
    private String message;
    public ErrorException(ErrorCodeImp errorCode) {
        this.message = errorCode.getMessage();
    }
    @Override
    public String getMessage() {
        return message;
    }
}
