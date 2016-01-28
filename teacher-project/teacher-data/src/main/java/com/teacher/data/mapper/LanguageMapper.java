package com.teacher.data.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.teacher.common.vo.LanguageVO;

@Service
public interface LanguageMapper {
  
	public LanguageVO selectById(@Param("id") Long id);
	
	public List<LanguageVO> selectAll();
}
