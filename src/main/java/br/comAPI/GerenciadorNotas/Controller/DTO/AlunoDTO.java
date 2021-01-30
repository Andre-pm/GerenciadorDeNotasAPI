package br.comAPI.GerenciadorNotas.Controller.DTO;

import java.util.List;
import java.util.stream.Collectors;

import br.comAPI.GerenciadorNotas.modelo.Aluno;

public class AlunoDTO {
	
	private int alunoID;
	private String nome;
	
	
	
	public AlunoDTO(Aluno aluno) {
		this.alunoID = aluno.getAlunoID();
		this.nome = aluno.getNome();
	}

	public int getAlunoID() {
		return alunoID;
	}
	
	public String getNome() {
		return nome;
	}
	
	public static List<AlunoDTO> converter (List<Aluno> alunos){
		return alunos.stream().map(AlunoDTO::new).collect(Collectors.toList());
		
	}
	
	

}
