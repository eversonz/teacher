package com.teacher.data.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.teacher.common.vo.CountryVO;

@Service
public interface CountryMapper {
  
	public CountryVO selectById(@Param("id") long id);
	
	public List<CountryVO> selectAll();
	
}
