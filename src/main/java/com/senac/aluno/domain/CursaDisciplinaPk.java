package com.senac.aluno.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

/**
 * A anotação @Embeddable marca a classe que será responsável por conter as chaves primarias
 *
 **/
@Embeddable
public class CursaDisciplinaPk implements Serializable {
	
	@Transient
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name="disciplina_id")
	Disciplina disciplina;
	
	@ManyToOne
	Aluno aluno;
	
	public CursaDisciplinaPk() {
		
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	@Override
	public String toString() {
		return "CursaDisciplinaPk [disciplina=" + disciplina + ", aluno=" + aluno + "]";
	}

}
