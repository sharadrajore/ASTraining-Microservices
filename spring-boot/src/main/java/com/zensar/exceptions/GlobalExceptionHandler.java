package com.zensar.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.zensar.entity.ErrorResponse;
@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleException(){
		return new ResponseEntity<ErrorResponse>(new ErrorResponse(new Date(),"Product Not Available With Given Product Id"), HttpStatus.NOT_FOUND);
	}

}
