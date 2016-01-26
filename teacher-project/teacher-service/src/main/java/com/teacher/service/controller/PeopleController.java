package com.teacher.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.teacher.common.vo.PeopleVO;
import com.teacher.service.bo.PeopleBO;
import com.teacher.service.config.ReturnRest;

@RestController
@RequestMapping("/people")
public class PeopleController extends BaseController{
	
	@Autowired
	PeopleBO peopleBO;
	
	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.MULTIPART_FORM_DATA_VALUE)
	public ReturnRest create(@RequestBody PeopleVO people) {
		
		log.info("rest novo..." + people.getName());
		return new ReturnRest("...");
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/{id}")
	public ReturnRest alter(@RequestBody PeopleVO people) {
		
		log.info("rest alterar..." + people.getId());
		return new ReturnRest("...");
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	public ReturnRest delete(@PathVariable("id") int id) {
		
		log.info("rest excluir...");
		return new ReturnRest("...");
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/{id}")
	public ReturnRest get(@PathVariable("id") int id) {
		
		log.info("rest buscar...");
		return new ReturnRest("...");
	}

}
