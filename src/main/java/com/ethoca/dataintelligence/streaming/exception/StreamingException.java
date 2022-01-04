package com.ethoca.dataintelligence.streaming.exception;

public class StreamingException extends RuntimeException {
	@java.io.Serial
	private static final long serialVersionUID = 1L;

	private final int errorCode;

	public StreamingException(StreamingErrors streamingErrors) {
		super(streamingErrors.errorMessage);
		this.errorCode = streamingErrors.errorCode;
	}

	public int getErrorCode() {
		return errorCode;
	}
	
	@Override
	public String toString() {
		return "StreamingException [errorCode=" + errorCode + ", errorMessage=" + getMessage() + "]";
	}

}
