package com.ethoca.dataintelligence.streaming.exception;

import lombok.Data;

@Data
public class ErrorMessage {
	private int errorCode;
	private String errorMessage;
}
