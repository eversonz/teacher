package com.teacher.service.config;

import org.springframework.http.HttpStatus;

import com.teacher.common.exception.BusinessException;

public class ReturnRest {

	public enum ReturnStatus{
		OK(HttpStatus.OK.value()), 
		ERROR_VALIDATE(HttpStatus.PRECONDITION_REQUIRED.value()), 
		ERROR(HttpStatus.BAD_REQUEST.value());
		
		private ReturnStatus(int value) {
			this.value = value;
		}
		
		private int value;

		public int getValue() {
			return value;
		}
	}
	
	private int http;
	private String message;
	private Object data;
	
	/**
	 * When OK 
	 */
	public ReturnRest() {
		this.http = HttpStatus.OK.value();
	}
	
	/**
	 * When OK with return
	 */
	public ReturnRest(Object values) {
		this.http = HttpStatus.OK.value();
		this.data = values;
	}

	
	/**
	 * @param http - required
	 * @param values
	 * @param message - required
	 */
	public ReturnRest(ReturnStatus http, Object values, String message) {
		this.http = http.getValue();
		this.data = values;
		this.message = message;
		
		if (http == null || message == null) {
			throw new BusinessException("notfound http or message");
		}
	}

	public int getHttp() {
		return http;	
	}

	public String getMessage() {
		return message;
	}
	
	public Object getData() {
		return data;
	}
	
}
