package com.senac.aluno.repository;

import org.springframework.data.repository.CrudRepository;

import com.senac.aluno.domain.Aluno;


public interface AlunoRepository extends CrudRepository<Aluno, Long>{

}
