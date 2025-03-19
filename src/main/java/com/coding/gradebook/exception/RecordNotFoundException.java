package com.coding.gradebook.exception;

public class RecordNotFoundException extends RuntimeException{

    private String message;

    public RecordNotFoundException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
