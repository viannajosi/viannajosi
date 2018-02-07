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

import com.senac.aluno.domain.Professor;
import com.senac.aluno.repository.ProfessorRepository;

@Controller
@RequestMapping(path="/professores")
public class ProfessorController {

	
	@Autowired
	private ProfessorRepository repository;
	
	
	@GetMapping()
	public @ResponseBody Iterable<Professor> all() {
		return repository.findAll();
	}
	
	@PostMapping()
	public @ResponseBody String add(@RequestBody Professor professor) {
		repository.save(professor);
		return "Saved";
	}
	
	@DeleteMapping(path="/{id}")
	public @ResponseBody String remove(@PathVariable long id) {
		repository.delete(id);
		return "Removed";
	}
	
	@GetMapping(path="/{id}")
	public ResponseEntity<Professor> findById(@PathVariable long id) {
		Professor professor = repository.findOne(id);
		return new ResponseEntity<Professor>(professor, HttpStatus.CREATED);
	}
	
	@PutMapping()
	public ResponseEntity<Professor> update(@RequestBody Professor professor) {
		repository.save(professor);
		return new ResponseEntity<Professor>(professor, HttpStatus.ACCEPTED);
	}
}
