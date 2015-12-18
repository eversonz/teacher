package com.teacher.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.teacher.service.bo.UsuarioBO;

@Controller
public class TestController {

	@Autowired
	UsuarioBO usuarioBO;
	
	String message = "Welcome to Spring MVC!";
	 
	@RequestMapping("/spring-web")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		System.out.println(message);
		
		usuarioBO.login("", "");
 
		ModelAndView mv = new ModelAndView("spring");
		mv.addObject("message", message);
		return mv;
	}	
	
}
