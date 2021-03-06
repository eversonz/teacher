package com.teacher.common.vo;

import java.util.Date;

public class PeopleVO {

	private long id;
	private CountryVO country;
	private RoleVO role; // Nivel de acesso / Role
	private MatterVO matter; // Materia
	private String name;
	private String email;
	private String password;
	private byte [] avatar;
	private Date register;
	private Date access;
	private CurriculumVO curriculum;
	
	public MatterVO getMatter() {
		return matter;
	}
	public void setMatter(MatterVO matter) {
		this.matter = matter;
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
	public CurriculumVO getCurriculum() {
		return curriculum;
	}
	public void setCurriculum(CurriculumVO curriculum) {
		this.curriculum = curriculum;
	}

}
