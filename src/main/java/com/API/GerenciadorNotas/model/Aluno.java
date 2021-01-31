package com.API.GerenciadorNotas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import com.API.GerenciadorNotas.repository.AlunoRepository;

@Entity
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAlu;

	@Column(nullable = false)
	private String nome;

	private float notas;

	private float media;

	public Long getIdAlu() {
		return idAlu;
	}

	public void setIdAlu(Long idAlu) {
		this.idAlu = idAlu;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getNotas() {
		return notas;
	}

	public void setNota(float notas, int peso) {
		this.notas = (this.notas + (notas*peso));
	}

	public float getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = (this.media + media);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idAlu == null) ? 0 : idAlu.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (idAlu == null) {
			if (other.idAlu != null)
				return false;
		} else if (!idAlu.equals(other.idAlu))
			return false;
		return true;
	}


}
