package com.API.GerenciadorNotas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Respostas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idResp;

	@Column(nullable = false)
	private Long idAluResp;

	@Column(nullable = false)
	private Long idGabResp;
	
	@Column(nullable = false)
	private int notaProva;
	

	public Long getIdResp() {
		return idResp;
	}

	public void setIdResp(Long idResp) {
		this.idResp = idResp;
	}

	public Long getIdAluResp() {
		return idAluResp;
	}

	public void setIdAluResp(Long idAluResp) {
		this.idAluResp = idAluResp;
	}

	public Long getIdGabResp() {
		return idGabResp;
	}

	public void setIdGabResp(Long idGabResp) {
		this.idGabResp = idGabResp;
	}
	
	public int getNotaProva() {
		return notaProva;
	}

	public void setNotaProva(int notaProva) {
		this.notaProva = notaProva;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idResp == null) ? 0 : idResp.hashCode());
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
		Respostas other = (Respostas) obj;
		if (idResp == null) {
			if (other.idResp != null)
				return false;
		} else if (!idResp.equals(other.idResp))
			return false;
		return true;
	}

	

	
	





}
