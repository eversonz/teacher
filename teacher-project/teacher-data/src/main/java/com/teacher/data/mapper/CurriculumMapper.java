package com.teacher.data.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.teacher.common.vo.CurriculumVO;

@Service
public interface CurriculumMapper {

	public CurriculumVO selectByUri(@Param("uri") String id);
	
	public CurriculumVO selectById(@Param("id") Long id);
	
	public List<CurriculumVO> selectAll();
	
	public List<CurriculumVO> selectByMonitor(@Param("role") Long role,
			@Param("area") Long area, @Param("state") String state,
			@Param("search") String search, @Param("country") Long country);
	
	public void delete(@Param("peopleId") Long peopleId);
	
	public void insert(CurriculumVO curriculum);
	
	public void update(CurriculumVO curriculum);
}
