package com.API.GerenciadorNotas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.API.GerenciadorNotas.repository.AlunoRepository;

@RestController
public class AprovadosController {

	@Autowired
	private AlunoRepository alunoRepository;

	@RequestMapping(value = "/list/aprovados", method = RequestMethod.GET)
	public String listarAprovados() {
		String nomes = "";
		if (alunoRepository.existsById((long) 1)) {
			for (long i = 1; i <= alunoRepository.count(); i++) {
				if (alunoRepository.findById(i).get().getMedia()>=7) {
					nomes = nomes + "ID ("+ i +") - "+ alunoRepository.findById(i).get().getNome() + " Média: (" + alunoRepository.findById(i).get().getMedia() +")\n";
				}

			}
			return nomes;
		}else {
			return "Não há Alunos cadastrados";
		}
	}
}
