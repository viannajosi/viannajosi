package com.senac.aluno.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class Endereco implements Serializable {
	
	@Transient
	private static final long serialVersionUID =1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(nullable = false, length = 150)
	private String logradouro;
	@Column(nullable = false, length = 10)
	private String numero;
	@Column(nullable = false, length = 200)
	private String complemento;
	@Column(nullable = false, length = 150)
	private String bairro;
	@Column(nullable = false, length = 20)
	private String cep;
	
	@OneToOne
	private String cidade;
	@OneToOne
	private String estado;
	
	public Endereco() {
		
	}
	
	public Long getId() {
		return id;
	}
	
	
}
