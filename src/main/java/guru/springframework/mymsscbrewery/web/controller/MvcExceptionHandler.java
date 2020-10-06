package guru.springframework.mymsscbrewery.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//shared across controllers
@ControllerAdvice
public class MvcExceptionHandler {
	
	//adding method validation
	//this annotation will trigger the following method when a certain type of exception is triggered
	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<List> validationErrorHandler(ConstraintViolationException e) {
		
		//get the list of errors
		List<String> errors = new ArrayList<>(e.getConstraintViolations().size());
		
		e.getConstraintViolations().forEach(constraintViolation -> {
			
			errors.add(constraintViolation.getPropertyPath() + ":" + constraintViolation.getMessage());
		});
		
		//return it to the consumer
		return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(BindException.class)
	public ResponseEntity<List> handleBindException(BindException ex) {
	
		return new ResponseEntity(ex.getAllErrors(), HttpStatus.BAD_REQUEST);
	}
}
