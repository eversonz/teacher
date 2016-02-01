package com.teacher.service.bo;

import java.util.List;

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
		usuarioMapper.insert(peopleVO);
		return null;
	}
	
	/**
	 * No password update. Looking for updatePassword
	 */
	public PeopleVO updatePeople(Long id, PeopleVO peopleVO) {	
		peopleVO.setId(id);
		usuarioMapper.update(peopleVO);
		return null;
	}

	public PeopleVO updatePassword(Long id, PeopleVO peopleVO) {
		usuarioMapper.updatePassword(id, peopleVO.getEmail(), peopleVO.getPassword());
		return null;
	}
	
	public void deletePeople(long id) {
		usuarioMapper.delete(id);
	}

	public PeopleVO selectPeople(long id) {
		return usuarioMapper.selectById(id);
	}
	
	public List<PeopleVO> selectPeople(String name, String email, Long role, Long language, Long country) {
		return usuarioMapper.select(name, email, role, language, country);
	}
	 
	public List<PeopleVO> selectByMonitor(Long roleId, Long areaId, String state, String search, Long countryId) {
		return usuarioMapper.selectByMonitor(roleId, areaId, state, search, countryId);
	}	
}
