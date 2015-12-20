package com.teacher.service.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teacher.common.vo.PeopleVO;
import com.teacher.data.mapper.*;


@Service
public class PeopleBO {
	
	@Autowired
	PeopleMapper usuarioMapper;
	
	public PeopleVO login(PeopleVO peopleVO) {
		
		usuarioMapper.login(peopleVO.getEmail(), peopleVO.getPassword());
		
		return null;
	}
	
}
