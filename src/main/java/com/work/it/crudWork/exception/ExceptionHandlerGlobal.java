package com.work.it.crudWork.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice 
public class ExceptionHandlerGlobal {
	
	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<DetailErr> handleNotFoundException(NotFoundException exErr, WebRequest webRequest){ 
		DetailErr err = new DetailErr (
				LocalDateTime.now(),
				exErr.getMessage(),
				webRequest.getDescription(false),
				"NOT FOUND"
		);
		return new ResponseEntity<>(err, HttpStatus.NOT_FOUND);
	}
}
