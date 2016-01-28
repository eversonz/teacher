package com.teacher.service.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;

public class ReturnRest {

	private Map <String, Object> data = new HashMap<String, Object>();
	
	public ReturnRest(HttpStatus http, Object values) {		
		mapData(http.value(), values);
	}

	public ReturnRest(int http, Object values) {
		mapData(http, values);
	}

	private void mapData(int http, Object values) {
		data.put("status", http);
		data.put("data", values);
	}
	
	public Map<String, Object> getData() {
		return data;
	}
	
}
