package com.API.GerenciadorNotas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.API.GerenciadorNotas.model.Gabarito;
import com.API.GerenciadorNotas.repository.GabaritoRepository;

@RestController
public class GabaritoController {

	@Autowired
	private GabaritoRepository gabaritoRepository;

	@RequestMapping(value = "/list/gabaritos")
	public List<Gabarito> listar(){
		return gabaritoRepository.findAll();
	}
	
	@RequestMapping(value = "/add/gabarito")
	public Gabarito adicionaGabarito(@RequestBody Gabarito gabarito) {
		return gabaritoRepository.save(gabarito);
	}
}
