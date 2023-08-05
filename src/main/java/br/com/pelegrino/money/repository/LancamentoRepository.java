package br.com.pelegrino.money.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pelegrino.money.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}
