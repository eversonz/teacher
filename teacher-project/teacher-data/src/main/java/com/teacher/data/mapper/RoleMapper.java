package com.teacher.data.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.teacher.common.vo.RoleVO;

@Service
public interface RoleMapper {
  
	public RoleVO selectById(@Param("id") Long id);
	
	public List<RoleVO> selectAll();
}
