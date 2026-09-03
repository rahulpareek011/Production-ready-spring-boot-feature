package com.rahulscripts.prod_ready_features.prod_ready_features.exceptions;

import org.springframework.context.annotation.Bean;


public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message) {
        super(message);
    }

}
