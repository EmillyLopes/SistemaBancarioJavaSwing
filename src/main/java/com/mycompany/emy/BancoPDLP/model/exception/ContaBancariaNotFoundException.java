package com.mycompany.emy.BancoPDLP.model.exception;

public class ContaBancariaNotFoundException extends RuntimeException{
    public ContaBancariaNotFoundException(String message) {
        super(message);
    }
}
