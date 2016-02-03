package com.teacher.service.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teacher.common.vo.CountryVO;
import com.teacher.common.vo.MatterVO;
import com.teacher.common.vo.RoleVO;
import com.teacher.data.mapper.CountryMapper;
import com.teacher.data.mapper.MatterMapper;
import com.teacher.data.mapper.RoleMapper;


@Service
public class CommonBO {
	
	@Autowired
	private CountryMapper countryMapper;
	@Autowired
	private MatterMapper matterMapper;
	@Autowired
	private RoleMapper roleMapper;
	
	public List<CountryVO> countrySelectAll() {
		return countryMapper.selectAll();
	}

	public List<RoleVO> roleSelectAll() {
		return roleMapper.selectAll();
	}
	 
	public List<MatterVO> matterSelectAll() {
		return matterMapper.selectAll();
	}
}
