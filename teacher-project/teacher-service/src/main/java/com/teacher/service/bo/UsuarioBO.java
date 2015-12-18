package com.teacher.service.bo;

import org.springframework.stereotype.Service;

import com.teacher.common.vo.UsuarioVO;
import com.teacher.data.mapper.UsuarioMapper;

@Service
public class UsuarioBO {

	private UsuarioMapper usuarioMapper;
	
	public UsuarioVO login(String user, String pass) {
		
		usuarioMapper.login(user, pass);
		
		return null;
	}
	
}
