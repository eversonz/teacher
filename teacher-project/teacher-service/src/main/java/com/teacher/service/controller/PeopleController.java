package com.teacher.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.teacher.common.vo.PeopleVO;
import com.teacher.service.bo.PeopleBO;
import com.teacher.service.config.ReturnRest;

@RestController
@RequestMapping("/people")
public class PeopleController extends RestBaseController{
	
	@Autowired
	PeopleBO peopleBO;
	
	@ResponseBody
	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ReturnRest create(@RequestBody PeopleVO people) {
		
		peopleBO.insertPeople(people);
		
		return returnRest();
	}
	
	@ResponseBody
	@RequestMapping(method=RequestMethod.PUT, value="/{id}", consumes=MediaType.APPLICATION_JSON_VALUE)
	public ReturnRest update(@PathVariable("id") Long id, @RequestBody PeopleVO people) {
		
		peopleBO.updatePeople(id,people);
		
		return returnRest();
	}

	@ResponseBody
	@RequestMapping(method=RequestMethod.PUT, value="/{id}/access", consumes=MediaType.APPLICATION_JSON_VALUE)
	public ReturnRest updatePassword(@PathVariable("id") Long id, @RequestBody PeopleVO people) {
		
		peopleBO.updatePassword(id, people);
		
		return returnRest();
	}
	@ResponseBody
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}", consumes=MediaType.APPLICATION_JSON_VALUE)
	public ReturnRest delete(@PathVariable("id") Long id) {
		
		peopleBO.deletePeople(id);
		
		return returnRest();
	}
	
	@ResponseBody
	@RequestMapping(method=RequestMethod.GET, value="/{id}")
	public ReturnRest get(@PathVariable("id") int id) {
		
		PeopleVO people = peopleBO.selectPeople(id);
		
		return returnRest(people);
	}
	
	@ResponseBody
	@RequestMapping(method=RequestMethod.GET)
	public ReturnRest select(@RequestParam(value="name", required=false) String name,
			@RequestParam(value="email", required=false) String email,
			@RequestParam(value="role", required=false) Long role,
			@RequestParam(value="language", required=false) Long language,
			@RequestParam(value="country", required=false) Long country
			) {

		List<PeopleVO> pList = peopleBO.selectPeople(name, email, role, language, country);
		
		return returnRest(pList);
	}
	
	@ResponseBody
	@RequestMapping(method=RequestMethod.GET, value="/monitor")
	public ReturnRest select(@RequestParam(value="role", required=false) Long role,
			@RequestParam(value="matter", required=false) Long matter,
			@RequestParam(value="state", required=false) String state,
			@RequestParam(value="search", required=false) String search,
			@RequestParam(value="country", required=false) Long country
			) {

		List<PeopleVO> pList = peopleBO.selectByMonitor(role, matter, state, search, country);
		
		return returnRest(pList);
	}

}
