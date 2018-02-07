package com.senac.aluno.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.senac.aluno.domain.Pessoa;
import com.senac.aluno.repository.PessoaRepository;



@Controller
@RequestMapping(path="/pessoas")
public class PessoaController {
	
	
	@Autowired
	private PessoaRepository repository;

	@GetMapping()
	public @ResponseBody Iterable<Pessoa> all() {
		return repository.findAll();
	}
	
	@PostMapping()
	public @ResponseBody String add(@RequestBody Pessoa pessoa) {
		repository.save(pessoa);
		return "Saved";
	}
	
	@DeleteMapping(path="/{id}")
	public @ResponseBody String remove(@PathVariable long id) {
		repository.delete(id);
		return "Removed";
	}
	
	@GetMapping(path="/{id}")
	public ResponseEntity<Pessoa> findById(@PathVariable long id) {
		Pessoa pessoa = repository.findOne(id);
		return new ResponseEntity<Pessoa>(pessoa, HttpStatus.CREATED);
	}
	
	@PutMapping()
	public ResponseEntity<Pessoa> update(@RequestBody Pessoa pessoa) {
		repository.save(pessoa);
		return new ResponseEntity<Pessoa>(pessoa, HttpStatus.ACCEPTED);
	}

}
