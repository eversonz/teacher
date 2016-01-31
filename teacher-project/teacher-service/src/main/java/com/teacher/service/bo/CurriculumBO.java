package com.teacher.service.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teacher.common.vo.CurriculumVO;
import com.teacher.common.vo.PeopleVO;
import com.teacher.data.mapper.CurriculumMapper;


@Service
public class CurriculumBO {
	
	@Autowired
	CurriculumMapper curriculumMapper;
	
	public void insertCurriculum(CurriculumVO curriculum) {
		curriculumMapper.insert(curriculum);
	}
	
	public void updateCurriculum(Long peopleId, CurriculumVO curriculum) {
		PeopleVO people = new PeopleVO();
		people.setId(peopleId);
		curriculum.setPeople(people);
		curriculumMapper.update(curriculum);
	}
	
	public void deleteCurriculum(Long id) {
		curriculumMapper.delete(id);
	}
	
	/**
	 * curriculum id is the same people.id
	 */
	public CurriculumVO selectById(Long id) {
		return curriculumMapper.selectById(id);
	}

	/**
	 * uri is unique by currulum
	 */
	public CurriculumVO selectByUri(String uri) {
		return curriculumMapper.selectByUri(uri);
	}
	
	public List<CurriculumVO> selectByMonitor(Long roleId, Long areaId, String state, String search, Long countryId) {
		return curriculumMapper.selectByMonitor(roleId, areaId, state, search, countryId);
	}	
	 
}
