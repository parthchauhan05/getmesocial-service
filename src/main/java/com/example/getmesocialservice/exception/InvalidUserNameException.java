package com.example.getmesocialservice.exception;

public class InvalidUserNameException extends Exception{
    @Override
    public String getMessage() {
        return "Invalid User Name";
    }
}
