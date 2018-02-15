package com.senac.aluno.domain;

public enum SituacaoAluno {
	
	
	ATIVO(1, "Aluno Ativo"), INATIVO (2, "Aluno Inativo");
	
	private int id;
	private String descricao;
	
	private SituacaoAluno(int id, String descricao) {
		this.id= id;
		this.descricao= descricao;
		
	}
	
	public int getId() {
		return id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static SituacaoAluno toEnum(Integer id) {
		if(id == null) {
			return null;
		}
		
		for(SituacaoAluno sa : SituacaoAluno.values()) {
			if(id.equals(sa.getId())) {
				return sa;
			}
		}
		
		throw new IllegalArgumentException("Id inválido " + id);
	}

}
