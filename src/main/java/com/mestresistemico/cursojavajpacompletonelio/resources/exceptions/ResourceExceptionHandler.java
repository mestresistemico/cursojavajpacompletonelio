package com.mestresistemico.cursojavajpacompletonelio.resources.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.mestresistemico.cursojavajpacompletonelio.services.exceptions.DatabaseException;
import com.mestresistemico.cursojavajpacompletonelio.services.exceptions.ResourceNotFoundException;


@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request){
		StandardError err = new StandardError();
		err.setError("Resource not found"); 
		err.setPath(request.getRequestURI()); 
		err.setStatus(HttpStatus.NOT_FOUND.value()); 
		err.setMessage(e.getMessage()); 
		err.setTimestamp(Instant.now());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
	}

	@ExceptionHandler(DatabaseException.class)
	public ResponseEntity<StandardError> database(DatabaseException e, HttpServletRequest request){
		StandardError err = new StandardError();
		err.setError("Database error"); 
		err.setPath(request.getRequestURI()); 
		err.setStatus(HttpStatus.BAD_REQUEST.value()); 
		err.setMessage(e.getMessage()); 
		err.setTimestamp(Instant.now());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
	}
}
