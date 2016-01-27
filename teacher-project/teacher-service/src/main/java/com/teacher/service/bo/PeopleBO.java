package com.teacher.service.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teacher.common.vo.PeopleVO;
import com.teacher.data.mapper.PeopleMapper;


@Service
public class PeopleBO {
	
	@Autowired
	PeopleMapper usuarioMapper;
	
	public PeopleVO login(PeopleVO peopleVO) {
		return usuarioMapper.login(peopleVO.getEmail(), peopleVO.getPassword());
	}
	
	public PeopleVO insertPeople(PeopleVO peopleVO) {
		return usuarioMapper.insert(peopleVO);
	}
	
	public PeopleVO updatePeople(PeopleVO peopleVO) {	
		return usuarioMapper.update(peopleVO);
	}
	
	public void deletePeople(long id) {
		usuarioMapper.delete(id);
	}
	
	public PeopleVO selectPeople(long id, String name, String email, String role, String language, String country) {
		return usuarioMapper.select(id);
	}
	 
}
