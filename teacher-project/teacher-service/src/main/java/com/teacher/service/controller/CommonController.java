package com.teacher.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.teacher.service.bo.CommonBO;
import com.teacher.service.config.ReturnRest;

@RestController
@RequestMapping
public class CommonController extends BaseController{
	
	@Autowired
	private CommonBO commonBO;
	
	@RequestMapping(method=RequestMethod.GET, value="/country")
	public ReturnRest selectCountry() {
		return returnRest(commonBO.languageSelectAll());
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/role")
	public ReturnRest selectRole() {
		return returnRest(commonBO.RoleSelectAll());
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/language")
	public ReturnRest selectLanguage() {
		return returnRest(commonBO.languageSelectAll());
	}

}
