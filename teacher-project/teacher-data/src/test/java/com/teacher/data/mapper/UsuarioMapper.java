package com.teacher.data.mapper;

import org.springframework.stereotype.Service;

import com.teacher.common.vo.UsuarioVO;

@Service
public interface UsuarioMapper {

	public UsuarioVO login(String user, String pass);
	
	
	
}
