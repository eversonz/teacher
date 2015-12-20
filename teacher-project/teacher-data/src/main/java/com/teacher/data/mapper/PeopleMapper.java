package com.teacher.data.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.teacher.common.vo.PeopleVO;

@Service
public interface PeopleMapper {
  
	public PeopleVO login(@Param("email") String email, @Param("password") String password);
	
}
