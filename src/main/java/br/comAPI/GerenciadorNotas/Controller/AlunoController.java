package br.comAPI.GerenciadorNotas.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.comAPI.GerenciadorNotas.Controller.DTO.AlunoDTO;
import br.comAPI.GerenciadorNotas.modelo.Aluno;

@RestController
public class AlunoController {

	
	@RequestMapping(value = "/alunos", method = RequestMethod.GET)
	public List<AlunoDTO> listar(String param){
		System.out.println(param);
		
		Aluno alu = new Aluno(001,"André","01/05/2001","000000","Blumenau","Garcia","Amazonas","1230");
		return AlunoDTO.converter(Arrays.asList(alu,alu,alu));
	}
	
}
