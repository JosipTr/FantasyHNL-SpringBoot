package com.example.fantasyhnl;

import java.io.FileNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@ExceptionHandler({FileNotFoundException.class})
	protected ResponseEntity<Object> handleException(Exception ex, WebRequest request) {
		HttpHeaders httpHeaders = new HttpHeaders();
		String responseBody = "Server error";
		HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
		return handleExceptionInternal(ex, responseBody, httpHeaders, status, request);
	}
	
	protected ResponseEntity<Object> handleFileNotFoundException(Exception ex, String responseBody, HttpHeaders httpHeaders, HttpStatus status, WebRequest request ) {
		
		logger.info(request.getContextPath());
		logger.error(responseBody, ex.fillInStackTrace());
		var response = new ResponseEntity<Object>(responseBody, status);
		return response;
	}
	
	protected ResponseEntity<Object> handleExceptionInternal(Exception ex, String responseBody, HttpHeaders httpHeaders, HttpStatus status, WebRequest request ) {
		logger.info(request.getContextPath());
		logger.error(responseBody, ex.fillInStackTrace());
		var response = new ResponseEntity<Object>(responseBody, status);
		return response;
	}
}
