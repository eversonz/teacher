package com.teacher.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	String message = "Welcome to Spring MVC!";
	 
	@RequestMapping("/spring")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		System.out.println(message);
 
		ModelAndView mv = new ModelAndView("spring");
		mv.addObject("message", message);
		return mv;
	}	
	
}
