package com.stackroute.exceptions;

public class UserAlreadyExistsExceptions extends Exception {

    private String message;

    public UserAlreadyExistsExceptions()
    {

    }

    public UserAlreadyExistsExceptions(String message)
    {
        super(message);
        this.message=message;
    }
}
