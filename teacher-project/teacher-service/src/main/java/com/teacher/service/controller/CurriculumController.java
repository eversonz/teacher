package com.teacher.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.teacher.common.vo.CurriculumVO;
import com.teacher.service.bo.CurriculumBO;
import com.teacher.service.config.ReturnRest;

@RestController
@RequestMapping("/curriculum")
public class CurriculumController extends RestBaseController{
	
	@Autowired
	CurriculumBO curriculumBO;
	
	@ResponseBody
	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ReturnRest create(@RequestBody CurriculumVO curriculum) {
		
		curriculumBO.insertCurriculum(curriculum);
		return returnRest();
	}
	
	@ResponseBody
	@RequestMapping(method=RequestMethod.PUT, value="/{id}", consumes=MediaType.APPLICATION_JSON_VALUE)
	public ReturnRest update(@PathVariable("id") Long id, @RequestBody CurriculumVO curriculum) {
		
		curriculumBO.updateCurriculum(id,curriculum);
		return returnRest();
	}

	@ResponseBody
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}", consumes=MediaType.APPLICATION_JSON_VALUE)
	public ReturnRest delete(@PathVariable("id") Long id) {
		
		curriculumBO.deleteCurriculum(id);
		return returnRest();
	}
	
	@ResponseBody
	@RequestMapping(method=RequestMethod.GET, value="/{id}")
	public ReturnRest get(@PathVariable("id") Long id) {
		
		CurriculumVO curriculum = curriculumBO.selectById(id);
		return returnRest(curriculum);
	}

	@ResponseBody
	@RequestMapping(method=RequestMethod.GET, value="/uri/{uri}")
	public ReturnRest get(@PathVariable("uri") String uri) {
		
		CurriculumVO curriculum = curriculumBO.selectByUri(uri);
		return returnRest(curriculum);
	}

}
