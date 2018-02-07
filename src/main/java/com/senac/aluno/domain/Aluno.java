package com.senac.aluno.domain;



import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
 
import javax.persistence.Transient;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Aluno extends Pessoa  {

	
	@Transient
	private static final long serialVersionUID = 1L;
	
	
	@Column(nullable = false, unique = true)	
	private String email;
	
	private SituacaoAluno Situacao;
	
	/**
	 * @Autowired - Informar  que o Spring irá gerenciar o instaciamneto do objeto
	 * @ElementCollection - Define o mapeamento da coleção aonde é feito o reacionamento(cardionalidade) 1- n (one-to-many) 
	 * @CollectionTable-( name="telefone") -  Especifica o nome da tabela que será usado pelo mapeamento
	 * **/
	
	@Autowired
	@ElementCollection
	@CollectionTable(name="telefone")
	private Set<String> telefone; 
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public SituacaoAluno getSituacao() {
		return Situacao;
	}

	public void setSituacao(SituacaoAluno situacao) {
		Situacao = situacao;
	}

	
	
	
	
	
	
	
	
}
