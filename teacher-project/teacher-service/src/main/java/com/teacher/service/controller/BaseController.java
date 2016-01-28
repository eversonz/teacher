package com.teacher.service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;

import com.teacher.service.config.ReturnRest;

public class BaseController {

	protected Logger log = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * @return Status 200 - OK
	 */
	protected ReturnRest returnRest(Object values) {
		return new ReturnRest(HttpStatus.OK, values);
	}
	
	/**
	 * @return Status 200 - OK
	 */
	protected ReturnRest returnRest() {
		return new ReturnRest(HttpStatus.OK, null);
	}
	
	/**
	 * @return Status 440 - ERROR
	 */
	protected ReturnRest returnRestError(String error) {
		return new ReturnRest(440, error);
	}
}
