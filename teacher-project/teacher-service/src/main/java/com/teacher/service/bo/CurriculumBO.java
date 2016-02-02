package com.teacher.service.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teacher.common.vo.CurriculumVO;
import com.teacher.data.mapper.CurriculumMapper;


@Service
public class CurriculumBO {
	
	@Autowired
	CurriculumMapper curriculumMapper;
	
	public void insertCurriculum(CurriculumVO curriculum) {
		curriculumMapper.insert(curriculum);
	}
	
	public void updateCurriculum(Long id, CurriculumVO curriculum) {
		curriculum.setId(id);
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
	 
}
