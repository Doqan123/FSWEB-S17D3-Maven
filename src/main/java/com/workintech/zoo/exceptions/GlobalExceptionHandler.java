package com.workintech.zoo.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ZooErrorResponse> handleException (ZooException zooException){
        ZooErrorResponse zooErrorResponse = new ZooErrorResponse(zooException.getHttpStatus().value(), zooException.getLocalizedMessage(), System.currentTimeMillis());
        log.error("Exception occured= ", zooException);
        return new ResponseEntity<>(zooErrorResponse, zooException.getHttpStatus());
    }

    @ExceptionHandler
    public ResponseEntity<ZooErrorResponse> handleException (Exception exception){
        ZooErrorResponse zooErrorResponse = new ZooErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), exception.getMessage(), System.currentTimeMillis());
        log.error("Exception occured= ", exception);
        return new ResponseEntity<>(zooErrorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
