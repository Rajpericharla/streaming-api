package com.ethoca.dataintelligence.streaming.exception;

public enum StreamingErrors {

	SUCCESS(200, "The request was processed successfully"), BAD_REQUEST(400, "Bad Request"),
	NOT_FOUND(404, "Not Found"), INTERNAL_SERVER_ERROR(500, "Internal Server Error");

	public final int errorCode;
	public final String errorMessage;

	StreamingErrors(int errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}
}
