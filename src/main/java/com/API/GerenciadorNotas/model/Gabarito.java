package com.API.GerenciadorNotas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gabarito {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idGab;
	
	@Column(nullable = false)
	private String nomeProva;
	
	@Column(nullable = false)
	private int peso;

	
	public Long getIdGab() {
		return idGab;
	}

	public void setIdGab(Long idGab) {
		this.idGab = idGab;
	}

	public String getNomeProva() {
		return nomeProva;
	}

	public void setNomeProva(String nomeProva) {
		this.nomeProva = nomeProva;
	}

	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idGab == null) ? 0 : idGab.hashCode());
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
		Gabarito other = (Gabarito) obj;
		if (idGab == null) {
			if (other.idGab != null)
				return false;
		} else if (!idGab.equals(other.idGab))
			return false;
		return true;
	}

	
}
