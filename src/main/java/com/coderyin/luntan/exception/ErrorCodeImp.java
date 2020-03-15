package com.coderyin.luntan.exception;

public enum  ErrorCodeImp implements ErrorCode {
    OBJECT_NOT_FOUND("你要找的东西不在了");
    private String message;
    @Override
    public String getMessage() {
        return message;
    }
     ErrorCodeImp(String message) {
        this.message = message;
    }
}
