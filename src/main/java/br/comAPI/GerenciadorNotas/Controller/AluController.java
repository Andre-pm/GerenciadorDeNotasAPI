package br.comAPI.GerenciadorNotas.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.comAPI.GerenciadorNotas.Controller.DTO.AlunoDTO;
import br.comAPI.GerenciadorNotas.modelo.Aluno;
import br.comAPI.GerenciadorNotas.repository.AluRepository;


@RestController
public class AluController {
	@Autowired
	private AluRepository aluRepository;
	
	@RequestMapping(value = "/alu", method=RequestMethod.GET)
	public List<AlunoDTO> listar(){
		List<Aluno> alunos = aluRepository.findAll();
		return AlunoDTO.converter(alunos);
	}
	
	@RequestMapping(value = "/alu", method=RequestMethod.POST)
	public void cadastrar(@RequestBody String info) {
		System.out.println(info);
		
	}
	
	
}
