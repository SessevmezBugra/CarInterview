package com.interview.advice;

public class InvalidInputException extends Exception {

    public InvalidInputException(String errorMessage) {
        super(errorMessage);
    }

}