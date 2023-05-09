package br.com.pelegrino.money.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pelegrino.money.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
	
}
