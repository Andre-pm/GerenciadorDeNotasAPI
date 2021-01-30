package br.comAPI.GerenciadorNotas.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aluno {
	@Id
	private int alunoID;
	private String nome;
	private String dataNasc;
	private String cep;
	private String cidade;
	private String bairro;
	private String rua;
	private String complemento;
	
	public Aluno() {
		
	}
	
	public Aluno(int alunoID, String nome, String dataNasc, String cep, String cidade, String bairro, String rua,
			String complemento) {
		super();
		this.alunoID = alunoID;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.cep = cep;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.complemento = complemento;
	}
	public int getAlunoID() {
		return alunoID;
	}
	public void setAlunoID(int alunoID) {
		this.alunoID = alunoID;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
}
