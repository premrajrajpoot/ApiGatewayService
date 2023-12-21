package com.Customerservice.CustomerService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;





@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	
	public ResponseEntity<ApiResponse>handlerResponseNotfoundException( ResourceNotFoundException ex){
	
		
		  String message=ex.getMessage();
		  
		  ApiResponse api=new ApiResponse();
		  
		  
		  api.setMessage(message);
		  api.setSuccess(true);
		  api.setStatus(HttpStatus.NOT_FOUND);
		  
		 return new ResponseEntity<>(api,HttpStatus.NOT_FOUND);
	}

	
}
