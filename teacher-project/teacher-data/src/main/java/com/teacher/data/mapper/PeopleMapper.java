package com.teacher.data.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.teacher.common.vo.PeopleVO;

@Service
public interface PeopleMapper {
  
	public PeopleVO login(@Param("email") String email, @Param("password") String password);
	
	public void update(PeopleVO people);
	
	public void updatePassword(@Param("id") Long id, @Param("email") String email, @Param("password") String password);
	
	public void insert(PeopleVO people);
	
	public void delete(@Param("id") long id);
	
	public PeopleVO selectById(@Param("id") long id);
	
	public List<PeopleVO> select(@Param("name") String name, @Param("email")  String email, @Param("role")  Long role, 
			@Param("language") Long language, @Param("country") Long country);
	
	public List<PeopleVO> selectByMonitor(@Param("role") Long role,
			@Param("area") Long area, @Param("state") String state,
			@Param("search") String search, @Param("country") Long country);
}
