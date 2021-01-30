package br.comAPI.GerenciadorNotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.comAPI.GerenciadorNotas.modelo.Aluno;
@Repository
public interface AluRepository extends JpaRepository<Aluno, Integer>{


}
