package com.examples.core;

class CustomException extends Exception {
    CustomException(String errorMessage) {
        super(errorMessage);
    }
}

public class UserDefinedExceptions {
    public static void main(String[] args) throws CustomException {
        throw new CustomException("User defined exception");
    }
}
