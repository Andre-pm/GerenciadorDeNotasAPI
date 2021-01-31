package com.API.GerenciadorNotas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.API.GerenciadorNotas.model.Aluno;
import com.API.GerenciadorNotas.repository.AlunoRepository;

@RestController
public class AlunoController {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@RequestMapping(value = "/list/alunos", method = RequestMethod.GET)
	public List<Aluno> listar() {  
		return alunoRepository.findAll();
	}
	
	@RequestMapping(value = "/add/aluno", method = RequestMethod.POST)
	public Aluno adicionarAluno(@RequestBody Aluno aluno) {
		return alunoRepository.save(aluno);
	}

}
