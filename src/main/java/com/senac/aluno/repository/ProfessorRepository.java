package com.senac.aluno.repository;

import org.springframework.data.repository.CrudRepository;

import com.senac.aluno.domain.Professor;



public interface ProfessorRepository  extends CrudRepository<Professor, Long> {

}
