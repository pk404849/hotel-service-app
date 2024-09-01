package com.hotel.app.exception;

import java.sql.Timestamp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(HotelException.class)
	public ResponseEntity<?> handleHotelException(HotelException hotelException) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setErrorMessage(hotelException.getMessage());
		errorResponse.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		errorResponse.setDateTime(new Timestamp(System.currentTimeMillis()));
		return ResponseEntity.ok(errorResponse);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleGlobalException(Exception ex) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setErrorMessage(ex.getMessage());
		errorResponse.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		errorResponse.setDateTime(new Timestamp(System.currentTimeMillis()));
		return ResponseEntity.ok(errorResponse);
	}
}
