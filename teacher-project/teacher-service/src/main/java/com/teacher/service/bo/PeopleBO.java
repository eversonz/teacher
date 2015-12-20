package com.teacher.service.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teacher.common.vo.UsuarioVO;
import com.teacher.data.mapper.*;


@Service
public class UsuarioBO {
	
	@Autowired
	Teste teste;
	@Autowired
	UsuarioMapper usuarioMapper;
	
	public UsuarioVO login(String user, String pass) {
		
		teste.teste();
		usuarioMapper.login(user, pass);
		
		return null;
	}
	
}
