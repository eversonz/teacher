package com.teacher.data.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.teacher.common.vo.RoleVO;

@Service
public interface AreaMapper {
  
	public RoleVO selectById(@Param("id") Long id);
	
	public List<RoleVO> selectAll();
}
