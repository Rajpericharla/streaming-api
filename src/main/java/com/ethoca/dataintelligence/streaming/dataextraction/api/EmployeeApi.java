package com.ethoca.dataintelligence.streaming.dataextraction.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ethoca.dataintelligence.streaming.dataextraction.model.EmployeeResponse;
import com.ethoca.dataintelligence.streaming.exception.StreamingErrors;
import com.ethoca.dataintelligence.streaming.exception.StreamingException;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;

@Api(value = "EmployeeApi")
@RestController
@RequestMapping(value = "api/v1/employee", produces = { MediaType.APPLICATION_JSON_VALUE })
@Slf4j
public class EmployeeApi {

	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "The request was processed successfully", response = StreamingErrors.class),
			@ApiResponse(code = 400, message = "Bad Request", response = StreamingErrors.class),
			@ApiResponse(code = 404, message = "Not Found", response = StreamingErrors.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = StreamingErrors.class), })
	@GetMapping
	public ResponseEntity<EmployeeResponse> getEmployee() {
	
//	public ResponseEntity<EmployeeResponse> getEmployee(
//			@ApiParam(value = "Employee Request Body", required = true) @RequestBody EmployeeRequest employeeRequest) {
		log.info("START");

		// log.info("EmployeeRequest: {}", employeeRequest);
		if(Boolean.TRUE) {
			throw new StreamingException(StreamingErrors.INTERNAL_SERVER_ERROR);
		}
		
		log.info("END");
		return new ResponseEntity<>(new EmployeeResponse("1", "Ethoca"), HttpStatus.OK);
	}
}
