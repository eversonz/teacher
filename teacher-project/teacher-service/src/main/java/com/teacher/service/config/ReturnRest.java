package com.teacher.service.config;

import java.util.HashMap;
import java.util.Map;

public class ReturnRest {

	private Map <String, Object> data = new HashMap<String, Object>();
	
	public ReturnRest(Object values) {		
		data.put("data", values);
	}

	public Map<String, Object> getData() {
		return data;
	}
	
}
