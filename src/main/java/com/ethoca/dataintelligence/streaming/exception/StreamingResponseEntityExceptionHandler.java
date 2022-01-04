package com.ethoca.dataintelligence.streaming.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice(basePackages = { "com.ethoca.dataintelligence.streaming" })
@Slf4j
public class StreamingResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public final ResponseEntity<ErrorMessage> handleException(Exception exception) {
		log.error(exception.toString());
		System.out.println("handleException() >>" + exception);
		
		ErrorMessage errorMessage = new ErrorMessage();
		errorMessage.setErrorCode(StreamingErrors.INTERNAL_SERVER_ERROR.errorCode);
		errorMessage.setErrorMessage(exception.getLocalizedMessage());
		
		return ResponseEntity.badRequest().body(errorMessage);
	}
	
	@ExceptionHandler(StreamingException.class)
	@ResponseBody
	public final ResponseEntity<ErrorMessage> handleException(StreamingException streamingException) {
		log.error(streamingException.toString());
		System.out.println("handleException() >>" + streamingException);
		
		ErrorMessage errorMessage = new ErrorMessage();
		errorMessage.setErrorCode(streamingException.getErrorCode());
		errorMessage.setErrorMessage(streamingException.getLocalizedMessage());
		
		return ResponseEntity.badRequest().body(errorMessage);
	}
	
}
