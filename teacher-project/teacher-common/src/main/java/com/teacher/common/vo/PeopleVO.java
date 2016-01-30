package com.teacher.common.vo;

import java.util.Date;

public class PeopleVO {

	private long id;
	private CountryVO country;
	private RoleVO role; // Nivel de acesso / Role
	private LanguageVO language; // lingua nativa
	private String name;
	private String email;
	private String password;
	private byte [] avatar;
	private Date register;
	private Date access;
	private CurriculumVO curriculumVO;
	
	public LanguageVO getLanguage() {
		return language;
	}
	public void setLanguage(LanguageVO language) {
		this.language = language;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public CountryVO getCountry() {
		return country;
	}
	public void setCountry(CountryVO country) {
		this.country = country;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public byte[] getAvatar() {
		return avatar;
	}
	public void setAvatar(byte[] avatar) {
		this.avatar = avatar;
	}
	public Date getRegister() {
		return register;
	}
	public void setRegister(Date register) {
		this.register = register;
	}
	public Date getAccess() {
		return access;
	}
	public void setAccess(Date access) {
		this.access = access;
	}
	public RoleVO getRole() {
		return role;
	}
	public void setRole(RoleVO role) {
		this.role = role;
	}
	public CurriculumVO getCurriculumVO() {
		return curriculumVO;
	}
	public void setCurriculumVO(CurriculumVO curriculumVO) {
		this.curriculumVO = curriculumVO;
	}
	
}
