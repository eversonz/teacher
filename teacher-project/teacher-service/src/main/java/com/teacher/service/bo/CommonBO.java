package com.teacher.service.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teacher.common.vo.CountryVO;
import com.teacher.common.vo.LanguageVO;
import com.teacher.common.vo.RoleVO;
import com.teacher.data.mapper.CountryMapper;
import com.teacher.data.mapper.LanguageMapper;
import com.teacher.data.mapper.RoleMapper;


@Service
public class CommonBO {
	
	@Autowired
	private CountryMapper countryMapper;
	@Autowired
	private LanguageMapper languageMapper;
	@Autowired
	private RoleMapper roleMapper;
	
	public List<CountryVO> countrySelectAll() {
		return countryMapper.selectAll();
	}

	public List<RoleVO> RoleSelectAll() {
		return roleMapper.selectAll();
	}
	 
	public List<LanguageVO> languageSelectAll() {
		return languageMapper.selectAll();
	}
}
