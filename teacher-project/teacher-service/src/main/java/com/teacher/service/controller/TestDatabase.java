package com.teacher.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.teacher.common.vo.PeopleVO;
import com.teacher.service.bo.PeopleBO;

@Controller
public class TestDatabase extends BaseController {

	@Autowired
	PeopleBO usuarioBO;
	
	String message = "Passou no SQL - Spring MVC";
	
	@RequestMapping("/web-testdatabase")
	public ModelAndView showMessage() {
		
		log.info(message);	
		
		usuarioBO.login(new PeopleVO());
 
		ModelAndView mv = new ModelAndView("/template/main");
		mv.addObject("message", message);
		return mv;
	}	
	
}
