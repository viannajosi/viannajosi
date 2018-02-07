package com.senac.aluno.repository;

import org.springframework.data.repository.CrudRepository;

import com.senac.aluno.domain.Pessoa;

public interface PessoaRepository extends CrudRepository<Pessoa, Long>{

}
