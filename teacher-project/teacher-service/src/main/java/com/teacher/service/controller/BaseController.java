package com.teacher.service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.teacher.service.config.ReturnRest;

public class BaseController {

	protected Logger log = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * @return Status 200 - OK
	 */
	protected ReturnRest returnRest(Object values) {
		return new ReturnRest(values);
	}
	
	/**
	 * @return Status 200 - OK
	 */
	protected ReturnRest returnRest() {
		return new ReturnRest();
	}
	
	/**
	 * @return Status - ERROR
	 */
	protected ReturnRest returnRestError(String message) {
		return new ReturnRest(ReturnRest.ReturnStatus.ERROR, null, message);
	}
	
	/**
	 * @return Status - ERROR VALIDATE
	 */
	protected ReturnRest returnRestErrorValidate(String message) {
		return new ReturnRest(ReturnRest.ReturnStatus.ERROR_VALIDATE, null, message);
	}
}
