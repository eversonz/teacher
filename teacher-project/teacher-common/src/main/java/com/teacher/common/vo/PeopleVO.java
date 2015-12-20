package com.teacher.common.vo;

import java.util.Date;

public class UsuarioVO {

	private long id;
	private String nome;
	private String email;
	private String senha;
	private PaisVO pais; 
	private byte [] avatar;
	private char nivel;
	private Date dataCadastro;
	private Date ultimoAcesso;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public PaisVO getPais() {
		return pais;
	}
	public void setPais(PaisVO pais) {
		this.pais = pais;
	}
	public byte[] getAvatar() {
		return avatar;
	}
	public void setAvatar(byte[] avatar) {
		this.avatar = avatar;
	}
	public char getNivel() {
		return nivel;
	}
	public void setNivel(char nivel) {
		this.nivel = nivel;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public Date getUltimoAcesso() {
		return ultimoAcesso;
	}
	public void setUltimoAcesso(Date ultimoAcesso) {
		this.ultimoAcesso = ultimoAcesso;
	}
	
}
