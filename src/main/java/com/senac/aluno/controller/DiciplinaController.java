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

import com.senac.aluno.domain.Diciplina;
import com.senac.aluno.repository.DiciplinaRepository;


@Controller
@RequestMapping(path="/diciplinas")
public class DiciplinaController {
	
	@Autowired
	private DiciplinaRepository repository;
	
	
	@GetMapping()
	public @ResponseBody Iterable<Diciplina> all() {
		return repository.findAll();
	}
	
	@PostMapping()
	public @ResponseBody String add(@RequestBody Diciplina diciplina) {
		repository.save(diciplina);
		return "Saved";
	}
	
	@DeleteMapping(path="/{id}")
	public @ResponseBody String remove(@PathVariable long id) {
		repository.delete(id);
		return "Removed";
	}
	
	@GetMapping(path="/{id}")
	public ResponseEntity<Diciplina> findById(@PathVariable long id) {
		Diciplina diciplina = repository.findOne(id);
		return new ResponseEntity<Diciplina>(diciplina, HttpStatus.CREATED);
	}
	
	@PutMapping()
	public ResponseEntity<Diciplina> update(@RequestBody Diciplina diciplina) {
		repository.save(diciplina);
		return new ResponseEntity<Diciplina>(diciplina, HttpStatus.ACCEPTED);
	}

}
