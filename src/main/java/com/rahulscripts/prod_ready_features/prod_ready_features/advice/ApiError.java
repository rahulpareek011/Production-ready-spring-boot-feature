package com.rahulscripts.prod_ready_features.prod_ready_features.advice;

import lombok.Data;
import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;

@Data
public class ApiError {
    private LocalDateTime timeStamp;
    private String error;
    private HttpStatus statusCode;

    ApiError(){
        this.timeStamp = LocalDateTime.now();
    }

    ApiError(String error,HttpStatus statusCode){
        this();
        this.error = error;
        this.statusCode = statusCode;
    }
}
