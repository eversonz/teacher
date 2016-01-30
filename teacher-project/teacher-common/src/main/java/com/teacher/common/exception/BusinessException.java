package com.teacher.common.exception;

public class BusinessException extends RuntimeException {

	private static final long serialVersionUID = 1656010575281362335L;

	public BusinessException() {}
	
	public BusinessException(String message) {
		super(message);
	}
	
}
