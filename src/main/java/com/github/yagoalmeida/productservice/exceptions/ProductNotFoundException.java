package com.github.yagoalmeida.productservice.exceptions;

public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(final String msg) {
        super(msg);
    }
}
