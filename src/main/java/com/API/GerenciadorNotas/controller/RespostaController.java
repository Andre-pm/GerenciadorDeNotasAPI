package com.API.GerenciadorNotas.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.API.GerenciadorNotas.model.Respostas;
import com.API.GerenciadorNotas.repository.AlunoRepository;
import com.API.GerenciadorNotas.repository.GabaritoRepository;


@RestController
public class RespostaController {

	@Autowired
	private AlunoRepository alunoRepository;

	@Autowired
	private GabaritoRepository gabaritoRepository;
	



	@RequestMapping(value = "/add/resposta", method = RequestMethod.POST)
	public String adicionaResposta(@RequestBody Respostas resposta) {
		if (alunoRepository.existsById(resposta.getIdAluResp())) {
			if (gabaritoRepository.existsById(resposta.getIdGabResp())) {
				alunoRepository.findById(resposta.getIdAluResp()).get().setNota(resposta.getNotaProva(),gabaritoRepository.findById(resposta.getIdGabResp()).get().getPeso());
				alunoRepository.findById(resposta.getIdAluResp()).get().setMedia(gabaritoRepository.findById(resposta.getIdGabResp()).get().getPeso());
				alunoRepository.save(alunoRepository.findById(resposta.getIdAluResp()).get());
			}else {
				return "Prova Não Encontrada";
			}
		}else {
			return "Aluno Não Encontrado";
		}
		return  "Nota " + alunoRepository.findById(resposta.getIdAluResp()).get().getNotas() + "\nMédia "+ (alunoRepository.findById(resposta.getIdAluResp()).get().getNotas()/alunoRepository.findById(resposta.getIdAluResp()).get().getMedia());
	}

}

