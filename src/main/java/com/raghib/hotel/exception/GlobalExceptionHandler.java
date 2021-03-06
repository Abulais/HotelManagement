package com.raghib.hotel.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.raghib.hotel.dto.ErrorDto;




@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<ErrorDto> dateNotFoundException(NotFoundException e){
		ErrorDto errorDto = new ErrorDto();
		errorDto.setMessage(e.getMessage());
		errorDto.setStatusCode(HttpStatus.NOT_FOUND.value());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorDto);
	}
	/*
	 * @ExceptionHandler(HospitalNotFoundException.class) public
	 * ResponseEntity<ErrorDto> hospitalNotFoundException(HospitalNotFoundException
	 * e){ ErrorDto errorDto = new ErrorDto(); errorDto.setMessage(e.getMessage());
	 * errorDto.setStatusCode(HttpStatus.NOT_FOUND.value()); return
	 * ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorDto); }
	 */
	 
		
}
