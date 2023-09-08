package com.sh20202404.foundation.bank.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandlerControllerAdvice {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	@ResponseStatus(value=HttpStatus.NOT_FOUND)
	@ResponseBody ExceptionResponse handlerResourceNotFoundException(ResourceNotFoundException myexception,HttpServletRequest request)
	{
		ExceptionResponse response = new ExceptionResponse();
		response.setErrorMessagee(myexception.getMessage());
		response.setRequestURI(request.getRequestURI());
		return response;
		
	}
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody ExceptionResponse handlerResourceNotFoundException(Exception myexception,HttpServletRequest request)
	{
		ExceptionResponse response = new ExceptionResponse();
		response.setErrorMessagee(myexception.getMessage());
		response.setRequestURI(request.getRequestURI());
		return response;
		
	}
	
	
	

}
