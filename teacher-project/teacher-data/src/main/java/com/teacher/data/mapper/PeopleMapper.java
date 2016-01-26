package com.teacher.data.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.teacher.common.vo.PeopleVO;

@Service
public interface PeopleMapper {
  
	public PeopleVO login(@Param("email") String email, @Param("password") String password);
	
	public PeopleVO update(PeopleVO people);
	
	public PeopleVO insert(PeopleVO people);
	
	public void delete(@Param("id") String id);
	
	public PeopleVO select(@Param("id") String id);
	
}
